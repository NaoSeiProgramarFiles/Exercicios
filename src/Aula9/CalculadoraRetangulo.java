package Aula9;

import java.util.Scanner;

public class CalculadoraRetangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();

        double perimetro = 2 * (largura + comprimento);
        double area = largura * comprimento;

        System.out.println("O perímetro do retângulo é: " + perimetro);
        System.out.println("A área do retângulo é: " + area);

        scanner.close();

    }
}
