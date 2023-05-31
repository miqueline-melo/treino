package treino;

import java.util.Scanner;

public class QuantidaDeCavalos12 {
    public static void main(String[] args) {

        double m, h, t, cavalos;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da massa: ");
        m = teclado.nextDouble();
        System.out.println("Digite a altura: ");
        h = teclado.nextDouble();
        System.out.println("Digite os seguntos: ");
        t=teclado.nextDouble();

        cavalos = (m*h/t)/745.6999;

        System.out.println("Sera necessario " + cavalos + " cavalos para levantar a quantidade de massa apresentada");
    }
}
