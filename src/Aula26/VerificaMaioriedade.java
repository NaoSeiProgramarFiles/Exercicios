package Aula26;
import java.util.Scanner;
public class VerificaMaioriedade {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.print("Digite a idade para verificar: ");
        int idade = entradaDados.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade.");
        }else {
            System.out.println("Você é menor de idade.");
        }

        entradaDados.close();
    }
}
