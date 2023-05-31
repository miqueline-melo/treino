package treino.Lampada.teste;

import treino.Lampada.dominio.Lampada;

public class LampadaTest {
    public static void main(String[] args) {

//Implementar uma classe Lampada que deve possuir como características tipo (led, fluorescente,...), voltagem,
//cor, marca, preço, potência, status(boolean). Nesta classe devem ser implementados os métodos
//construtores, getters, setters, toString, ascender e apagar. Em uma outra classe chamada LampadaTeste
//devem ser criados dois objetos do tipo Lampada, atribuir valores e exibir os dados deste objeto. O programa
//deverá informar também qual das duas lâmpadas possui maior potência e também qual das lâmpadas é a
//mais cara.


        Lampada lampada1 = new Lampada("fluorescente", "branca", "fiatLux", 110, 10.00, 40, false);
        Lampada lampada2 = new Lampada("led", "amarela", "fiatLux", 220, 15.00, 60, false);
        double potLampada1= 40;
        double potLampada2= 60;
        double valLampada1 = 10.00;
        double valLampada2 = 15.00;

        System.out.println("Dados da lampada 1 \n" + lampada1);
        System.out.println("Dados da lampada 2 \n" + lampada2);


        if (potLampada1 > potLampada2) {
            System.out.println("Lampada com maior potencia e a lampada 1 : \n" + potLampada1);
        } else
           System.out.println("Lampada com maior potencia e a lampada 2: \n" + potLampada2 );


        if (valLampada1 > valLampada2){
            System.out.println("Lampada mais cara e a lampada1 valor: \n" + valLampada1);
        }else {
            System.out.println("Lampada mais cara e a lampada2 valor: \n" + valLampada2);
        }
    }
}
