package exercicio02;

public class Quadrado extends FormaGeometrica{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}