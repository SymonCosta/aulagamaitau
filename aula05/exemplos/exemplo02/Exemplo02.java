package exemplos.exemplo02;

public class Exemplo02 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Symon");

        System.out.println(p.getNome());
        System.out.println(p);

        p = new Pessoa("Costa");

        System.out.println(p.getNome());
        System.out.println(p);
    }
}

