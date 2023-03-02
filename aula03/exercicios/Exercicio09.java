package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite, numero; 

        System.out.println("Digite o limite: ");
        limite = teclado.nextInt();

        numero = 1;
        
        while (numero <= limite) {
            if(numero * 2 <= limite){
            System.out.print(numero + ", ");
            } else{
        System.out.print(numero);
       }
        numero = numero * 2;

        } 
       
        //*for(numero = 1; numero <= limite; numero *=2 ){
        // System.out.println(numero + " ");
        //}
       
       
        teclado.close();

    }
}
