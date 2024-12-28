package Aula17;

import java.util.Scanner;

public class ExibirLetras2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        char[] letras = palavra.toCharArray();

        for (char letra : letras){
            System.out.println(letra);
        }
        scanner.close();

    }
}
