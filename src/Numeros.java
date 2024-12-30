/* Classe que realiza operacoes aritmeticas com numeros com :
 * +, -, *, /, fat (Static)
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

    public double div (Numeros a) throws InvalidNumberException{
        if(a.getN() == 0){
            throw new InvalidNumberException(a.getN());
        } 
        return this.n / a.getN();
    }

    public double div (int a) throws InvalidNumberException {
        if(a == 0){
            throw new InvalidNumberException(a);
        } 
        return this.n / a;
    }

    public double pot (Numeros a) throws InvalidNumberException {
        if(a.getN() < 0){
            throw new InvalidNumberException(a.getN());
        } 
        int p = this.n;
        for(int i = 1; i<a.getN(); i++){
            p = p*this.n; 
        }
        return p;
    }

    public double pot (int a) throws InvalidNumberException{
        if(a < 0){
            throw new InvalidNumberException(a);
        } 
        int p = this.n;
        for(int i = 1; i<a; i++){
            p = p*this.n; 
        }
        return p;
    }

    public boolean par (){
        return this.n%2 == 0; 
    }

    public boolean primo(){
        if (this.n <=1){
            return false;
        }
        for(int i = 2; i<this.n; i++){
            if (this.n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int fat (int x) throws InvalidNumberException {
        if(x < 0){
            throw new InvalidNumberException(x);
        } 
        if (x <= 1) {
            return 1;
        }
        return x * fat (x-1);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    

}
