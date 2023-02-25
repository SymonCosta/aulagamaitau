import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    String nome;

    System.out.println("Digite seu nome:");
    nome = teclado.nextLine();
    
    System.out.println("Olá " + nome);


    teclado.close();

    }



}
