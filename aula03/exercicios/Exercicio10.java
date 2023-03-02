package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int numero, pares;
      final int QTD_NUMEROS = 10;
      
      pares = 0;

      for( int cont = 1; cont <= QTD_NUMEROS; cont ++) {
        System.out.printf("Digite o %d numero:" , cont);
        numero = teclado.nextInt();

        if (numero % 2 == 0) { //verifica se o numero é par
            pares ++;
            
        }

      }

      System.out.printf("Foram digitados %d par(res) e %d impar(res).\n", pares, QTD_NUMEROS - pares);

    teclado.close();
    }

}
