package treino;

public class Horario {
    public static void main(String[] args) {

        int hora, minuto, segundo, passado, falta;


        hora = 20;
        minuto = 00;
        segundo = 00;

        passado = (segundo + minuto*60+ hora*3600);
        falta = 86400 - passado;

        System.out.println("Se passou " + passado + " falta " + falta );
    }
}
