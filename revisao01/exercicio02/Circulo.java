package exercicio02;


public class Circulo extends FormaGeometrica {
    private static final double PI = 3.1415;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return PI * (raio * raio);
    }
}
