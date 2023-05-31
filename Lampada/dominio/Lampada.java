package treino.Lampada.dominio;

public class Lampada {
    String tipo, cor, marca;
    double voltagem, preco, potencia;
    boolean status;

    public Lampada(String tipo, String cor, String marca, double voltagem, double preco, double potencia, boolean status) {
        this.tipo = tipo;
        this.cor = cor;
        this.marca = marca;
        this.voltagem = voltagem;
        this.preco = preco;
        this.potencia = potencia;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", voltagem=" + voltagem +
                ", preco=" + preco +
                ", potencia=" + potencia +
                ", status=" + status +
                '}';
    }

    public String ascender(){
        return ascender();
    }

    public String apagar(){
        return apagar();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
