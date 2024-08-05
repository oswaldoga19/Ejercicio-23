import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazGrafica {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Ecuación Cuadrática");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField aField = new JTextField(10);
        JTextField bField = new JTextField(10);
        JTextField cField = new JTextField(10);
        JButton calcularButton = new JButton("Calcular");

        calcularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double A = Double.parseDouble(aField.getText());
                double B = Double.parseDouble(bField.getText());
                double C = Double.parseDouble(cField.getText());

                double discriminante = B * B - 4 * A * C;

                if (discriminante > 0) {
                    double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
                    double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
                    JOptionPane.showMessageDialog(null,
                            "Solución 1 (x1): " + x1 + "\nSolución 2 (x2): " + x2);
                } else if (discriminante == 0) {
                    double x = -B / (2 * A);
                    JOptionPane.showMessageDialog(null, "Única solución (x): " + x);
                } else {
                    JOptionPane.showMessageDialog(null, "La ecuación no tiene soluciones reales.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("A:"));
        panel.add(aField);
        panel.add(new JLabel("B:"));
        panel.add(bField);
        panel.add(new JLabel("C:"));
        panel.add(cField);
        panel.add(calcularButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
