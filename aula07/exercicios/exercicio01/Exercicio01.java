package exercicios.exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Thor", 1000);
        Gerente gerente = new Gerente("Miguel", 1000, 30);

        funcionario.aumentarSalario(0.2f);
        gerente.aumentarSalario(0.2f);

        System.out.println(funcionario.imprimir());
        System.out.println(gerente.imprimir());
    } 
}
