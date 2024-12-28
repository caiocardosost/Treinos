public class Basico {
    public static double juros(double x) {
        return x*(10/100.00);
    }
    public static void main(String[] args) {
        double v = 25000.00;
        System.out.printf("Valor a vista: %.2f \n", v);
        System.out.printf("juros: %.2f \n", juros(v));
        System.out.printf("Valor total %.2f \n", (v+juros(v)));
        
    }
    
}
