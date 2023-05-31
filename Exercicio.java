package treino;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {

        int sexo, qtMulheres=0, qtHomens=0;
        float altura=0F, somaH=0, mediaHomens=0, maior=0, menor=0;

        Scanner teclado = new Scanner(System.in);

        for (int i=0; i<=10; i++){
            System.out.println("Escolha p sexo da pessoa(1-mulher, 2-homem) ");
            sexo=teclado.nextInt();
            System.out.println("Digite a altura: ");
            altura=teclado.nextFloat();
            if (sexo==1){
                qtMulheres++;
            }else if (sexo==2) {
                qtHomens++;
                somaH = somaH + altura;
            }else {
                System.out.println("Opcao sexo invalida. ");
            }
            if (altura > maior ){
                maior = altura;
            }else if (altura<menor){
                menor = altura;
            }
            mediaHomens= somaH/qtHomens;

            System.out.println("A maior altura do grupo e de " + maior + "metros");
            System.out.println("A media de altura dos homens e " + mediaHomens);
            System.out.println(" O numero de mulheres e " + qtMulheres);
        }



    }
}
