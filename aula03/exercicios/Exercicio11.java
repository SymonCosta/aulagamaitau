package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int  numero , soma = 0 , cont ;

        numero = 1 ;
        cont = 1 ;

        while ( numero != 0 ) {
            System.out.println( "Digito o " + cont + "º número inteiro ( 0 = fim ):" );
            numero = teclado.nextInt ();
            
            soma = soma + numero ;
            cont ++;
        }

        System.out.println( "Soma = " + soma );



    teclado.close();    


    }
}
