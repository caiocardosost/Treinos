public class Main_Numeros {
    public static void main(String[] args) {
        try{
            Numeros a = new Numeros (2);
            Numeros b = new Numeros (3);
            Numeros c = new Numeros (6);
            Numeros d = new Numeros (0);
            Numeros e = new Numeros (-3);

            System.out.println(a.getN() + " + " + b.getN() + " = " + a.soma(b));
            System.out.println(a.getN() + " +  256 = " + a.soma(256));
            System.out.println(c.getN() + " / " + a.getN() + " = " + c.div(a));
            System.out.println(a.getN() + " ^ " + b.getN() + " = " + a.pot(b));
            System.out.println(a.getN() + " * " + c.getN() + " = " + a.mul(c));
            System.out.println(a.getN() + " eh par? " + a.par());
            System.out.println(b.getN() + " eh par? " + b.par());
            System.out.println(c.getN() + " eh par? " + c.par());
            System.out.println("fatorial de " + c.getN() + " eh " + Numeros.fat(c.getN()));
            System.out.println(a.getN() + " eh primo? " + a.primo());
            System.out.println(b.getN() + " eh primo? " + b.primo());
            System.out.println(c.getN() + " eh primo? " + c.primo());

            // testando excessoes:
            //System.out.println(c.getN() + " / " + d.getN() + " = " + c.div(d));
            //System.out.println("fatorial de " + e.getN() + " eh " + Numeros.fat(e.getN()));
            System.out.println(a.getN() + " ^ " + e.getN() + " = " + a.pot(e));
        }
        catch(InvalidNumberException e){
            e.printStackTrace();
        }
    }
}
