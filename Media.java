package treino;

public class Media {
    public static void main(String[] args) {

        int valor1 = 8, valor2 = 9, valor3 = 7;
        int valor4 = 4, valor5 = 5, valor6 = 6;
        double media1, media2, media3, soma;

        media1 = (valor1+valor2+valor3)/3;
        media2 = (valor4+valor5+valor6)/3;
        media3 = (media1+ media2)/2;
        soma= media1+media2;

        System.out.println("O valor da media dos numeros 8,9,3 é: " + media1);
        System.out.println("O valor da media dos numeros 4,5,6 é: " + media2);
        System.out.println("O valor da media das 2 medias a cima é: " + media3);
        System.out.println("O valor da soma das medias é: " + soma);







    }
}
