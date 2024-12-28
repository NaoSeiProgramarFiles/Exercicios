package Aula13;

import java.util.Scanner;

public class CalculadoraTrabalho {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a força aplicada: ");
        double forca = scanner.nextDouble();

        System.out.print("Digite a distância percorrida: ");
        double distancia = scanner.nextDouble();

        double trabalho = forca * distancia;

        System.out.println("O trabalho realizado é: " + trabalho);

        scanner.close();

    }
}