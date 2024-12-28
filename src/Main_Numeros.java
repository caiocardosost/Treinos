public class Main_Numeros {
    public static void main(String[] args) {
        Numeros a = new Numeros (2);
        Numeros b = new Numeros (3);
        Numeros c = new Numeros (10);

        System.out.println(a.getN() + " + " + b.getN() + " = " + a.soma(b));
        System.out.println(a.getN() + " +  256 = " + a.soma(256));
        System.out.println(c.getN() + " / " + a.getN() + " = " + c.div(a));
        System.out.println(a.getN() + " ^ " + b.getN() + " = " + a.pot(b));
        System.out.println(a.getN() + " * " + c.getN() + " = " + a.mul(c));
        System.out.println(a.getN() + " eh par? " + a.par());
        System.out.println(b.getN() + " eh par? " + b.par());
        System.out.println(c.getN() + " eh par? " + c.par());


    }
}
