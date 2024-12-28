package Aula12;

import java.util.Scanner;

public class CalculadoraEnergiaCinetica {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa do objeto: ");
        double massa = scanner.nextDouble();

        System.out.print("Digite a velocidade do objeto: ");
        double velocidade = scanner.nextDouble();

        double energiaCinetica = (massa * Math.pow(velocidade, 2)) /2;

        System.out.println("A energia cinética do objeto é: " + energiaCinetica);

        scanner.close();


    }
}
