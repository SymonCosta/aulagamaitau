package exercicio02;

import java.util.ArrayList;

public class AppFigura {
  
        public static void main(String[] args) {
            Quadrado f1 = new Quadrado(10);
            Retangulo f2 = new Retangulo(10, 20);
            Triangulo f3 = new Triangulo(6, 6);
            Circulo f4 = new Circulo(10);
            
            ArrayList<FormaGeometrica> figuras = new ArrayList(); 
            
            figuras.add(f1);
            figuras.add(f2);
            figuras.add(f3);
            figuras.add(f4);
            
            for (FormaGeometrica fg : figuras) {
                System.out.println("Area: " + fg.calculaArea());
            }
    
        
        }

    }

