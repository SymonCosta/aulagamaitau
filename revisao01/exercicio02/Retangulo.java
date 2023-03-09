package exercicio02;

public class Retangulo extends Quadrado {
    private double lado2;


    public Retangulo(double lado, double lado2) {
        super(lado);
        this.lado2 = lado2;
    }
    @Override
    public double calculaArea() {
        return getLado() * lado2;
    }
}