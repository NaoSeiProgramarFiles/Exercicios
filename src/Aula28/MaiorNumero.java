package Aula28;
import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = entradaDados.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = entradaDados.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int numero3 = entradaDados.nextInt();

        int maior = numero1;

        if (numero2 > maior){
            maior = numero2;
        }

        if(numero3 > maior){
            maior = numero3;
        }

        System.out.println("O maior número é: " + maior);

        entradaDados.close();
    }

}
