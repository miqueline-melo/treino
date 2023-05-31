package treino.caneta.dominio;

public class Caneta {
    String marca, cor;
    double tamanho;
    

    public Caneta(String marca, String cor, double tamanho) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "caneta{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}

