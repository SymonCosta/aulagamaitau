package exercicios.exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Miguel", "Siames", 2015, "Symon", "(98) 99981-8810");

        System.out.println(animal1.getDados());


        Proprietario pr1 = new Proprietario("Francy", "(98) 99968-3718");

        Animal animal2 = new Animal("Thor", "Pitbull", 2013, pr1);

        System.out.println(animal2.getDados());

        // trocar o telefone do proprietário do animal2 ? (set)
        pr1.setTelefone("(98) 9999-8888");
        System.out.println(animal2.getDados());

        // trocar o telefone do proprietário do animal1 ? (set)
        animal1.getProprietario().setTelefone("(98) 98876-2323");
        System.out.println(animal1.getDados());

    }  
}
