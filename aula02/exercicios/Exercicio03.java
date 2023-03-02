package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new  Scanner ( System . in );  
        double  nota1 , nota2, media ;

       // Entrada de dados
       System.out.println( "Digite a primeira nota:" );
       nota1 = teclado.nextDouble();

       System.out.println( "Digite a segunda nota:" );
       nota2 = teclado.nextDouble();

       // Processamento
       media = ( nota1 + nota2 ) / 2 ;

       // saída de dados
       System.out.println( "\nMédia = " + media + "\n" );



    teclado.close();

    }
}
