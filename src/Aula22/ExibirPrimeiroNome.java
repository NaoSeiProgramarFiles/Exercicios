package Aula22;

import java.util.Scanner;

public class ExibirPrimeiroNome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String[] parteNome = nomeCompleto.split(" ");

        String primeiroNome = parteNome[0];

        System.out.println("Primeiro nome: " + primeiroNome);

        scanner.close();
    }
}
