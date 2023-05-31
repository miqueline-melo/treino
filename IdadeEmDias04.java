package treino;

import java.util.Scanner;

public class IdadeEmDias04 {
    public static void main(String[] args) {

        int dia=0, mes=0, ano=0, idade;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o dia de nascimento: ");
        dia = teclado.nextInt();
        System.out.println("Digite o mes de nascimento: ");
        mes = teclado.nextInt();
        System.out.println("Digite o ano de nascimento: ");
        ano = teclado.nextInt();

        idade = dia + mes*30 + ano*365;

        System.out.println("A sua idade em dias é: " +  idade);


    }
}
