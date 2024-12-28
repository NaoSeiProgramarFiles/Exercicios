package Aula21;

import java.util.Arrays;
import java.util.Scanner;

public class VerificaAnagrama {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        palavra1 = palavra1.replaceAll("\\s+", "").toLowerCase();
        palavra2 = palavra2.replaceAll("\\s+", "").toLowerCase();

        if(palavra1.length() != palavra2.length()) {
            System.out.println("A segunda palavra não é um anagrama da primeira.");
        }else{
            char[] arr1 = palavra1.toCharArray();
            char[] arr2 = palavra2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)){
                System.out.println("A segunda palavra é um anagrama da primeira.");
            }else{
                System.out.println("A segunda palavra não é um anagrama da primeira.");
            }
        }
        scanner.close();
    }
}
