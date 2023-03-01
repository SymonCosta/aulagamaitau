package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota, media;
        int cont;
        final int QTDE_ALUNOS = 5; // final = a constante(escreve em maiusculo e separa com _)

        cont = 1;
        media = 0;
        while (cont <= QTDE_ALUNOS) {
            System.out.println("Digite a nota: ("+ cont + "/" + QTDE_ALUNOS + ")"); // ("+ cont + "/" + QTDE_ALUNOS + ") comando para identificar quantidade de dados
            nota = teclado.nextDouble();
            media = media + nota;
            cont++;

        }
        
        media = media / QTDE_ALUNOS;
        System.out.println("Media Final: " + media);
        
        teclado.close();
    }
}
