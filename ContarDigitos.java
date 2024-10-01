import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {

        try(Scanner scan = new Scanner(System.in)) {

            //El número se ingresa como texto para contar sus dígitos e manera mas fácil
            System.out.println("Ingresa un número entero para conocer cuantos dígitos tiene");
            String number = scan.nextLine();

            System.out.printf("El número '%s' contiene %s dígitos", number, number.length());
        }
    }
}