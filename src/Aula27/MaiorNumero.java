package Aula27;
import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = entradaDados.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = entradaDados.nextInt();

        if (numero1 > numero2){
            System.out.println("O primeiro numero é maior.");
        } else if (numero2 > numero1) {
            System.out.println("O segundo numero é maior");

        } else {
            System.out.println("Os números são iguais.");
        }
        entradaDados.close();
    }

}
