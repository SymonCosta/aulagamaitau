package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    String senha;
    boolean valida;
    
    System.out.println("Digite a senha:");
    senha = teclado.nextLine();
    valida = senha.equals("R10p5");

    if (valida) {
        System.out.println("Acesso concedido!");
    } else {
        System.out.println("Acesso negado!");
    }
    

    teclado.close();

    }
}
