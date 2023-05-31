package treino;

import java.util.Scanner;

public class medidas {
    public static void main(String[] args) {

        double alturaParede, larguraDaParede, alturaAzulejo, larguraAzuleijo, areaDoAzuledo, areaDaparede, quantidadeAzulejo;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a altura da parede: ");
        alturaParede =teclado.nextDouble();
        System.out.println("Digite a largura da parede: ");
        larguraDaParede= teclado.nextDouble();
        System.out.println("Digite a altura do azulejo: ");
        alturaAzulejo = teclado.nextDouble();
        System.out.println("Digite a lagura do azulejo: ");
        larguraAzuleijo=teclado.nextDouble();

        areaDaparede = alturaParede * larguraDaParede;
        areaDoAzuledo = alturaAzulejo * larguraAzuleijo;

        quantidadeAzulejo = areaDaparede/areaDoAzuledo;

        System.out.println("Quantidade de azuleijo necessario para as medidas apresentadas e: " + quantidadeAzulejo);


    }
}
