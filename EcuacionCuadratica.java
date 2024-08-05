public class EcuacionCuadratica {
    public static void main(String[] args) {
        double A = 1.0; // Ingresa los valores de A, B y C aquí
        double B = 2.0;
        double C = -3.0;

        double discriminante = B * B - 4 * A * C;

        if (discriminante > 0) {
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Solución 1 (x1): " + x1);
            System.out.println("Solución 2 (x2): " + x2);
        } else if (discriminante == 0) {
            double x = -B / (2 * A);
            System.out.println("Única solución (x): " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
}
