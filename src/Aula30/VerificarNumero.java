package Aula30;
import java.util.Scanner;
public class VerificarNumero {
    public static void main(String[] args) {
        Scanner entradaDados  = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entradaDados.nextInt();

        if (numero > 0){
            System.out.println("O número é positivo.");
        } else if (numero < 0){
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        entradaDados.close();
    }
}
