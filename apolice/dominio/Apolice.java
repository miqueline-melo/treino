package treino.apolice.dominio;

import java.util.Scanner;

public class Apolice {
    String nomeSegurado;
    int idadeSegurado;
    double valorPremioApolice;

    public void imprimir(){
        System.out.println(this.nomeSegurado);
        System.out.println(this.idadeSegurado);
        System.out.println(this.valorPremioApolice);

    }
    public void calcularPremioApolice(){
        double premio1 = valorPremioApolice+=(valorPremioApolice*20)/100;
        double premio2 = valorPremioApolice+=(valorPremioApolice*15)/100;
        double premio3 = valorPremioApolice+=(valorPremioApolice*10)/100;

        if (idadeSegurado>=18 && idadeSegurado <=25){
            System.out.println(premio1);
        } else if (idadeSegurado>25 && idadeSegurado<=26) {
            System.out.println(premio2);
        }else if (idadeSegurado>36){
            System.out.println(premio3);
        }
    }
    public void oferecerDesconto( ){

        String cidade=null;
        String Curitiba = null, RioDeJaneiro = null , SaoPaulo = null, BeloHorizonte = null;
        double  desconto = valorPremioApolice - 0.20 * valorPremioApolice;
        double desconto2 = valorPremioApolice - 0.15 * valorPremioApolice;
        double desconto3 = valorPremioApolice - 0.10 * valorPremioApolice;
        double desconto4 = valorPremioApolice - 0.05 * valorPremioApolice;

        if (cidade == Curitiba){
            System.out.println(desconto);
        } else if (cidade==RioDeJaneiro) {
            System.out.println(desconto2);
        } else if (cidade == SaoPaulo) {
            System.out.println(desconto3);
        } else if (cidade == BeloHorizonte) {
            System.out.println(desconto4);
        }

    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }

    public double getValorPremioApolice() {
        return valorPremioApolice;
    }

    public void setValorPremioApolice(double valorPremioApolice)    {
        this.valorPremioApolice = valorPremioApolice;
    }
}
