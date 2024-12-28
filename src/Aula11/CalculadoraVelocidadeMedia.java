package Aula11;

import java.util.Scanner;

public class CalculadoraVelocidadeMedia {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a variação de espaço: (Δs): ");
        double variacaoEspaco = scanner.nextDouble();

        System.out.print("Digite a variação de tempo (Δt): ");
        double variacaoTempo = scanner.nextDouble();

        double velocidadeMedia = variacaoEspaco / variacaoTempo;

        System.out.println("A velocidade média é: " + velocidadeMedia);

        scanner.close();
    }
}
