

    public class Factorialrecursivas_2 {
        public static int recurFactorial(int n) {
            if (n == 1)
                return n;
            else
                return n * recurFactorial(n - 1);
        }

        public static void main(String[] args) {
            int num = 6;
            if (num < 0)
                System.out.println("Lo siento, el factorial no existe para números negativos");
            else if (num == 0)
                System.out.println("El factorial de 0 es 1");
            else
                System.out.println("El factorial de " + num + " es " + recurFactorial(num));
        }
    }


