package exercicios;


import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    double salarioBruto, valorPrestacao;

    System.out.println("Digite salario Bruto: ");
    salarioBruto = teclado.nextDouble();

    System.out.println("Digite a prestacao: ");
    valorPrestacao = teclado.nextDouble();
// Para codigo limpo 
//valorMaximo = salarioBruto * 0.3;
//podeEmprestar= valorPrestacao


    if (valorPrestacao <= 0.3 * salarioBruto) {
        System.out.println("Concedido");
        
    } else {
        System.out.println("Negado");
        
    }

    teclado.close();

    }
}
