

    public class Elevadorecursial_3 {

        public static void main(String[] args) {
            int base = 3;
            int exponente = 4;
            long result = calcular(base, exponente);
            System.out.println(base + "^" + exponente + " = " + result);
        }

        public static long calcular(int base, int exponente) {
            if (exponente == 0) {
                return 1L; // Cualquier número elevado a la potencia 0 es 1
            } else {
                return base * calcular(base, exponente - 1);
            }
        }
    }


