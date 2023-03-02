import java.util.Scanner;

public class EJERCICIO032 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una línea de caracteres: ");
        String linea = scanner.nextLine();
        scanner.close();

        char[] caracteres = linea.toCharArray();

       
        int[] frecuencia = new int[256]; 
        for (char c : caracteres) {
            frecuencia[c]++;
        }

        
        char maxChar = 0;
        int maxCount = 0;
        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] > maxCount) {
                maxChar = (char) i;
                maxCount = frecuencia[i];
            }
        }

       
        String resultado1 = "";
        for (char c : caracteres) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                resultado1 += maxChar;
            } else {
                resultado1 += c;
            }
        }

        
        String resultado2 = "";
        for (int i = caracteres.length - 1; i >= 0; i--) {
            resultado2 += caracteres[i];
        }

      
        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
    }

}
