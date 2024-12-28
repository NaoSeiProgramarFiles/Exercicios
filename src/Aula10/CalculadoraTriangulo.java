package Aula10;

import java.util.Scanner;

public class CalculadoraTriangulo {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado a do triângulo: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Digite o lado b do triângulo: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Digite o lado c do triângulo: ");
        double ladoC = scanner.nextDouble();

        System.out.print("Digite a altura h relativa do lado b do triângulo: ");
        double altura = scanner.nextDouble();

        double perimetro = ladoA + ladoB + ladoC;
        double area = (ladoB * altura) /2;

        System.out.println("O perímetro do triângulo é: " + perimetro);
        System.out.println("A área do triângulo é: " + area);

        scanner.close();



    }
}

