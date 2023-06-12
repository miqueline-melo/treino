package treino.apolice.teste;

import treino.apolice.dominio.Apolice;

import java.util.Scanner;

public class ApoliceTeste {
    public static void main(String[] args) {
        Apolice apolice = new Apolice();
        apolice.oferecerDesconto();
        apolice.setNomeSegurado("Jade");
        apolice.setIdadeSegurado(25);
        apolice.setValorPremioApolice(50);
        apolice.calcularPremioApolice();



        apolice.imprimir();












    }
}
