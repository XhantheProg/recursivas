
    public class Recesivorecurcial_4 {

        public static void main(String[] args) {
            int numeroInicial = 10;
            contarRegresivo(numeroInicial);
        }

        public static void contarRegresivo(int numero) {
            if (numero >= 0) {
                System.out.println(numero);
                contarRegresivo(numero - 1);
            } else {
                System.out.println("¡Listo!");
            }
        }
    }


