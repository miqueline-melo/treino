package treino;

import java.util.Scanner;

public class Senha15 {
    public static void main(String[] args) {
        int senha, codigo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o codigo de acesso: ");
        codigo = teclado.nextInt();

        if (codigo == 1234) {
            System.out.println("Digite a senha de acesso: ");
            senha = teclado.nextInt();
            if (senha == 9999) {
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Senha incorreta");
            }
          }else {
            System.out.println("Codigo incorreto");

            }
        teclado.close();
        }
    }

