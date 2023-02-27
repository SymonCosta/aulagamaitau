package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    String nome;
    double nota1, nota2, media;

    System.out.print("Digite seu nome: ");
    nome = teclado.nextLine();
    System.out.print("Digite a nota1: ");
    nota1 = teclado.nextDouble();
    System.out.print("Digite a nota2: ");
    nota2 = teclado.nextDouble();

    media = (nota1*0.4) + (nota2*0.6) /2;
    System.out.println("Media: " + media);

    if (media >= 6) {
        System.out.println("Aprovado" );
        
    } else {
        System.out.println("Reprovado" );
        
    }
    

   teclado.close();
    }
}
