package Aula33;

import java.util.Scanner;

public class VerificarDivisibilidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();

        int soma = numero1 + numero2 + numero3;

        if (soma % 5 == 0){
            System.out.println("A soma é divisível por 5.");
        } else {
            System.out.println("A soma não é divisivel por 5");
        }

        scanner.close();
    }
}
