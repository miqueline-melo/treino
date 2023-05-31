package treino;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        int inicio,fim, primo=0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite numero inicial: ");
        inicio = teclado.nextInt();
        System.out.println("Digite numero final");
        fim= teclado.nextInt();

        for (int i=inicio; i <=fim; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println("O numero " + i + " é primo!");
            }
            primo = 0;
        }
        teclado.close();


    }
}
