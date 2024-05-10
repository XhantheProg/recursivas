import java.util.Scanner;

public class Invertir_recursial_5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa una cadena:");
            String input = scanner.nextLine();
            System.out.println("La cadena invertida es: " + Reversa(input));
        }

        static String Reversa(String input) {
            if (input == null || input.length() <= 1) {
                return input;
            } else {
                return Reversa(input.substring(1)) + input.charAt(0);
            }
        }
    }


