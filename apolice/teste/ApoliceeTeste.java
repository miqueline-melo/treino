package treino.apolice.teste;

import treino.apolice.dominio.Apolicee;

public class ApoliceeTeste {
    public static void main(String[] args) {
        Apolicee apolice = new Apolicee();
        apolice.oferecerDesconto();
        apolice.setNomeSegurado("Jade");
        apolice.setIdadeSegurado(25);
        apolice.setValorPremioApolice(50);
        apolice.calcularPremioApolice();



        apolice.imprimir();












    }
}
