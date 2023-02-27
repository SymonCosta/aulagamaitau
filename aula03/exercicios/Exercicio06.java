package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    double salario;
    boolean isento, taxa01, taxa02, taxa03;
    
    System.out.println("Digite o salario: ");
    salario = teclado.nextDouble();
    taxa01 = teclado.nextBoolean();
    taxa02 = teclado.nextBoolean();
    taxa03 = teclado.nextBoolean();

    isento = salario <= 600.00;
    taxa01 = salario > 600.00;
    taxa02 = salario > 1200.00;
    taxa03 = salario > 2000.00;

    if (isento) {
        System.out.println("Isento");  
    }
    
    if (taxa01); {
        System.out.println("20%");
    }

    if (taxa02); {
        System.out.println("25%");
    }
    if (taxa03); {
        System.out.println("30%");
    }




    teclado.close();

    }
}
