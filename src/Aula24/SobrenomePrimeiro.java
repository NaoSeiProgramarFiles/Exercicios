package Aula24;

import java.util.Scanner;

public class SobrenomePrimeiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um nome completo: ");
        String nomeCompleto = scanner.nextLine();
        String [] partes = nomeCompleto.split(" ");
        String sobrenome = partes [partes. length - 1];
        System.out.print ("Nome com sobrenome primeiro: ");
        System.out.print (sobrenome);
        for (int i = 0; i < partes. length - 1; i++){
            System.out.print(" " + partes [i]);
            System.out.println("");
            scanner.close ();
        }
    }
}
