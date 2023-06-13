package treino.premio.dominio;


public class Apolicee {
    //3. Implementar uma classe Apolice com os seguintes atributos nome do segurado, idade do segurado e valor do
//        prêmio da apólice. Nesta classe Apolice devem ser implementados os métodos:
//        *imprimir () - este método não retorna valor e deverá mostrar na tela todos os atributos da classe Apolice. Para
//        imprimir em java usa-se o comando [System.out.println(nome do atributo);]
//        *calcularPremioApolice() - este método não retorna valor e deverá calcular o valor do prêmio seguindo as
//        seguintes regras: caso a idade seja maior ou igual a 18 e menor ou igual a 25 anos, use a formula
//        valorPremio+=(valorPremio*20)/100. Quando a idade for superior a 25 e menor ou igual a 26, use a formula
//        valorPremio+=(valorPremio*15)/100. Quando a idade for superior a 36 use a formula
//        valorPremio+=(valorPremio*10)/100.
//        *oferecerDesconto() - este método não retorna valor, mas recebe o parâmetro cidade, que irá conter o nome da
//        cidade para o cálculo do desconto. Caso a cidade seja Curitiba, dê um desconto de no valor do premio de 20%,
//        caso seja Rio de Janeiro, dê um desconto no valor do premio de 15%, caso seja São Paulo dê um desconto no
//        valor do premio de 10% e se for Belo Horizonte dê um desconto no valor do premio de 5%.
//        Logo após implementar a classe Apolice, implemente em uma classe chamada ApoliceTeste uma sequência de
//        instruções para testar as funcionalidades da classe Apolice.
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
