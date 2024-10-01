import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.println("Ingresa una cadena de texto para saber cuantas palabras tiene");
            String string = scan.nextLine();

            //Se quitan espacios extra y se convierte en arreglo
            string = string.trim().replaceAll("\\s+", " ");
            String[] words = string.split(" ");

            //Se usa la propiedad 'length' para el conteo
            System.out.printf("Tu cadena de texto contiene %s palabras", words.length);
        }
    }
}
