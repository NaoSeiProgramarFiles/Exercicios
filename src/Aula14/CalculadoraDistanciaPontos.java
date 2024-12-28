package Aula14;

import java.util.Scanner;

public class CalculadoraDistanciaPontos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada x do primeiro ponto: ");
        double x1 = scanner.nextDouble();

        System.out.print("Digite a coordenada y do primeiro ponto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Digite a coordenada x do segundo ponto: ");
        double x2 = scanner.nextDouble();

        System.out.print("Digite a coordenada y do segundo ponto: ");
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 -x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("A distancia entre os dois pontos é: %.2f%n", distancia);

        scanner.close();

    }
}
