package exercicios;
import java.util.Scanner;

public class Exercicio01 {
   
   
    public static void main(String[] args) {
      
    Scanner teclado = new Scanner(System.in);
    Double nota1, nota2;
    Double media;

       
    System.out.println("Digite Nota 1:" );
    nota1 = teclado.nextDouble();

    System.out.println("Digite Nota 2:" );
    nota2 = teclado.nextDouble();

    System.out.println("Media = ");
    System.out.println(media = ( nota1 + nota2 ) / 2.0 );
    media = teclado.nextDouble();



teclado.close();

    }
}
