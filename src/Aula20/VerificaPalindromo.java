package Aula20;

import java.util.Scanner;

public class VerificaPalindromo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();

        boolean palidromo = true;

        for (int i = 0; i < palavraFormatada.length() / 2; i++) {
            char a = palavraFormatada.charAt(i);
            char b = palavraFormatada.charAt(palavraFormatada.length() - 1 - i);
            if (a != b){
                palidromo  = false;
                break;
            }
        }
        if (palidromo){
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
        scanner.close();
    }
}
