package exercicios;
import java.util.Scanner;

public class Exercicio02 {
   
   
    public static void main(String[] args) {
      
    Scanner teclado = new Scanner(System.in);
    String nome;
    double nota1, nota2;
    double media;

    System.out.print("Digite o nome:" );
    nome = teclado.nextLine();
    
    System.out.println("Digite Nota 1:" );
    nota1 = teclado.nextDouble();

    System.out.println("Digite Nota 2:" );
    nota2 = teclado.nextDouble();

    System.out.print("Media = ");
    System.out.println(media = ( nota1 + nota2 ) / 2.0 );
    media = teclado.nextDouble();


teclado.close();

    }
}
