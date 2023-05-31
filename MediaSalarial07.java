package treino;

import java.util.Scanner;

public class MediaSalarial07 {
    public static void main(String[] args) {

        double salario1, salario2, salario3, salario4, mediaSalarial, mediaDeSofrimento, notaFuncionario1, notaFuncionario2, notaFuncionario3, notaFuncionario4;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite nota funcionario1: ");
        notaFuncionario1= teclado.nextDouble();
        System.out.println("Digite nota funcionario2: ");
        notaFuncionario2= teclado.nextDouble();
        System.out.println("Digite nota funcionario3: ");
        notaFuncionario3= teclado.nextDouble();
        System.out.println("Digite nota funcionario4: ");
        notaFuncionario4= teclado.nextDouble();



        System.out.println("Digite salario1: ");
        salario1= teclado.nextDouble();
        System.out.println("Digite salario2: ");
        salario2= teclado.nextDouble();
        System.out.println("Digite salario3: ");
        salario3= teclado.nextDouble();
        System.out.println("Digite fsalario4: ");
        salario4= teclado.nextDouble();

        mediaSalarial = (salario1+salario2+salario3+salario4)/4;
        mediaDeSofrimento = (notaFuncionario1+notaFuncionario2+notaFuncionario3+notaFuncionario4)/4;

        System.out.println("Media salarial dos funcionarios é: " + mediaSalarial);
        System.out.println("Media nota de sofrimento dos funcionarios é: "+ mediaDeSofrimento);

    }
}
