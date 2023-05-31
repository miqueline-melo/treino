package treino;

import java.util.Arrays;
import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {

        int[] VET = new int[50];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i <= 50; i++) {
            System.out.println("Digite um numero inteiro:"+ i +":");
            VET[i] = teclado.nextInt();

            for (int j = 0; j < 50; j++) {
                if (VET[i]==VET[j] && i!=j){
                    System.out.println("O numero " + i + " é repetido");
                    break;
                }
            }


        }
        teclado.close();
    }
}
