package Aula18;

import java.util.Scanner;

public class SubistituirLetras {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String novaFrase = frase.replace('a', 'e');

        System.out.println("Frase modificada: " + novaFrase);

        scanner.close();

    }
}
