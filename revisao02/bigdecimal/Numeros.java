import java.math.BigDecimal;

public class Numeros {
public static void main(String[] args) {
    double d1 = 0.1;
    double d2 = 0.2;
    
    System.out.println(d1 + d2);

    



    // como utilizamos a classe
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");

    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3.toString());
}
    
}