package Aula24;

import java.util.Scanner;

public class ContarVogais {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int contadorVogais = 0;

        for (int i = 0; i < palavra.length(); i++){
            char letra = Character.toLowerCase(palavra.charAt(i));

            if (letra == 'a' ||
            letra == 'e' ||
            letra == 'i' ||
            letra == 'o' ||
            letra == 'u') {
                    contadorVogais++;
            }
        }
        System.out.println("Quantidade de vogais: " + contadorVogais);
        scanner.close();
    }
}
