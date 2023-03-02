package exercicios;

import java.util.Scanner;

public class Exercicio01 {
public static void main(String[] args) {
    Scanner teclado =  new Scanner(System.in);
    int numero;

    System.out.println("Digite um numero:");
    numero=teclado.nextInt();

    par (numero);

    if( ehPar (numero)) {
        System.out.println(numero + " é par ");

    } else {
        System.out.println(numero + " é impar ");
    }
    
    teclado.close();

}

    static void par (int valor) {
       int sobra;

       sobra = valor % 2;

       if (sobra == 0) {
        System.out.println(valor + " é par");

       }else {
        System.out.println(valor + " é impar");
       }

     }

       static boolean ehPar (int valor) {

       
       // int sobra;

        // sobra = valor % 2;

        // if(sobra == 0) {
        // retorna verdadeiro;
        // } outro {
        // retorna falso;
        // }

        // if((valor % 2) == 0) {
        // retorna verdadeiro;
        // } outro {
        // retorna falso;
        // }

        return ( valor % 2 ) == 0 ;
// retorna o valor

}
    
}