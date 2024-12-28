package Aula02;

import java.util.Scanner;

public class MediaAritimetica {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = entrada.nextDouble();

        double media = (numero1 + numero2) /2;

        System.out.println("O resultado é: " + media);
    }

}
