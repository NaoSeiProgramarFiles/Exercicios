package Aula03;

import java.util.Scanner;

public class MediaAritimetica {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primiera nota: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segunda nota: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Digite o terceira nota: ");
        double numero3 = entrada.nextDouble();

        double media = (numero1 + numero2 + numero3) /3;

        System.out.println("A média das notas é: " + media);

        entrada.close();

    }
}
