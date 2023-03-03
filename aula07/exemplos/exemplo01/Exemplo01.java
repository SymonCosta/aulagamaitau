package exemplos.exemplo01;

public class Exemplo01 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Symon");
        Estudante e = new Estudante("Miguel");
        // Estudante e2 = new Estudante();

        // p.setNome("Carla");
        // System.out.println(p.getNome());
        // System.out.println(p.getNome("Nome: "));

        // e.setNome("Roberto");
        // System.out.println("Nome: " + e.getNome());
        // System.out.println("Nome: " + e2.getNome());

        // System.out.println(p.exibir());
        // System.out.println(e.exibir());
        System.out.println(p.toString());
        System.out.println(e);
    } 
}
