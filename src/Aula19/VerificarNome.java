package Aula19;

import java.util.Scanner;

public class VerificarNome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        String nomeMinusculo = nome.toLowerCase();

        if (nomeMinusculo.startsWith("a")) {
            System.out.println("O nome começa com a letra A.");
        } else {
            System.out.println("O nome não começa com a letra A.");
        }
        scanner.close();

    }

}
