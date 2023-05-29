package treino;

import java.util.Scanner;

public class ipiPecas {
    public static void main(String[] args) {

        double porcIpi, valorDasPeças, codigoPeça1, valorUnitarioPeca1, quantPeças1, codigoPeça2, valorUnitarioPeca2, quantPeças2;

        porcIpi= 00.2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o código da peça 1: ");
        codigoPeça1 = teclado.nextDouble();
        System.out.println("Digite o valor unitário da peça 1: ");
        valorUnitarioPeca1=teclado.nextDouble();
        System.out.println("Digite a quantidade de peças 1: ");
        quantPeças1 = teclado.nextDouble();
        System.out.println("Digite o código da peça 2: ");
        codigoPeça2 = teclado.nextDouble();
        System.out.println("Digite o valor unitário da peça 2: ");
        valorUnitarioPeca2 = teclado.nextDouble();
        System.out.println("Digite a quantidade de peças : ");
        quantPeças2 = teclado.nextDouble();


        double valorTotalASerPago = (valorUnitarioPeca1*quantPeças1 + valorUnitarioPeca2*quantPeças2)*(porcIpi/100+1);

        System.out.println("O valor total a ser pago é: " + valorTotalASerPago);



    }
}
