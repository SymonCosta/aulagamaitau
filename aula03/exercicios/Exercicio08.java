package exercicios;

import java.util.Scanner;

import javax.naming.ldap.Control;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabuada;
        int cont;

        System.out.println("Digite a tabuada: ");
        tabuada = teclado.nextInt();

        cont = 0;
        while (cont <= 10) {
           //System.out.println(tabuada + "x" + cont + "=" + (tabuada * cont));
           //%d = numero
           //%2d = 2 casas decimais

           System.out.printf("%d x %2d = %2d\n", tabuada, cont, (tabuada*cont) );
           cont++;

        }
        
    
        teclado.close();

    }
}
