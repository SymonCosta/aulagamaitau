package exercicios.exercicio03;

public class Veiculo {
     String  marca , modelo ;
     double consumo, privado ;

        Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca ;
        this.modelo = modelo ;
        this.consumo = consumo;
    }

    void exibir() {
        System.out.println( "Marca: " + marca );
        System.out.println( "Modelo: " + modelo );
    }

    double  obterConsumo () {
        return consumo ;
    }

    void  setConsumo ( double  consumo ) {
        if ( consumo > 0 ) {
            this.consumo = consumo ;
        }
    }
}
