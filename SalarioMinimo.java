package treino;

import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        double salMinimo, salUsuario, quantSalMinimo;

        salMinimo = 788.00;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do seu salario: ");
        salUsuario = teclado.nextDouble();

        quantSalMinimo = salUsuario/salMinimo;

        System.out.println("O seu salario e equivalente a " + quantSalMinimo + " salarios minino");



    }
}
