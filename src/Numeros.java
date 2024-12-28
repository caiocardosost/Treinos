/* Classe que realiza operacoes aritmeticas com numeros com :
 * +, -, *, /, fat
 * Tratamento de excessoes
 * 
 */
public class Numeros {
    
    private int n;

    Numeros(int n){
        this.n = n;
    }

    public int soma (Numeros a){
        return a.getN() + this.n;
    }

    public int soma (int a){
        return a + this.n;
    }

    public int sub (Numeros a){
        return this.n - a.getN();
    }

    public int sub (int a){
        return this.n - a;
    }

    public int mul (Numeros a){
        return this.n * a.getN();
    }

    public int mul (int a){
        return this.n * a;
    }

    public double div (Numeros a){
        return this.n / a.getN();
    }

    public double div (int a){
        return this.n / a;
    }

    public double pot (Numeros a){
        int p = this.n;
        for(int i = 1; i<a.getN(); i++){
            p = p*this.n; 
        }
        return p;
    }

    public double pot (int a){
        int p = this.n;
        for(int i = 1; i<a; i++){
            p = p*this.n; 
        }
        return p;
    }

    public boolean par (){
        return this.n%2 == 0; 
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    

}
