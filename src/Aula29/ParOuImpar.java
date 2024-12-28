package Aula29;
import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entradaDados.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é par.");
        } else{
            System.out.println("O núimero é impar");
        }
        entradaDados.close();
    }
}
