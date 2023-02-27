package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, valorPrestacao;
        double valorMaximo; 
        boolean podeEmprestar;
    
        System.out.println("Digite salario Bruto: ");
        salarioBruto = teclado.nextDouble();
    
        System.out.println("Digite a prestacao: ");
        valorPrestacao = teclado.nextDouble();
         // Para codigo limpo 

        valorMaximo = salarioBruto * 0.3;
        podeEmprestar= valorPrestacao <= valorMaximo;
    
    
        if (podeEmprestar) {
            System.out.println("Concedido");
            
        } else {
            System.out.println("Negado");
            
        }

        System.out.println();
        System.out.println("Fim da operação!");
    
        teclado.close();

    }
    
}
