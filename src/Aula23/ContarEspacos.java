package Aula23;

import java.util.Scanner;

public class ContarEspacos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contadorEspacos = 0;

        for (int i =0; i < frase.length(); i++){
            if (frase.charAt(i) == ' '){
                contadorEspacos++;
            }
        }

        System.out.println("Quantidade de espaços em branco: " + contadorEspacos);

        scanner.close();
    }

}
