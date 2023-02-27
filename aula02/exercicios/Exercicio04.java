package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    double salarioMinimo, valorkW, valorApagar, valorComdesconto;
    int qtdkW;

    //Entrada de Dados
    System.out.println("Digite o salario:" );
    salarioMinimo = teclado.nextDouble(); 

    System.out.println("Digite o kW:" );
    qtdkW = teclado.nextInt(); 

    //Processamento
    valorkW = salarioMinimo / 500;
    valorApagar = qtdkW * valorkW;
    valorComdesconto = valorApagar * 0.85;

    //Saida
    System.out.println("Valor de 1 kW= R$" + valorkW );
    System.out.println("Valor a pagar: R$" + valorApagar );
    System.out.println("Valor com desconto: R$" + valorComdesconto);

    





    
    
    
    
    
    
    
    
    teclado.close();
    }
}
