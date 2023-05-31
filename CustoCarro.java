package treino;

import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {

        double valorCarro, valorFinal, percentualDistribuidor, imposto;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do veiculo: ");
        valorCarro=teclado.nextDouble();

        percentualDistribuidor = 0.28;
        imposto = 0.45;

        valorFinal = valorCarro + valorCarro*percentualDistribuidor + valorCarro*imposto;

        System.out.println("Valor total do veiculo é: " + valorFinal);

        teclado.close();
    }
}
