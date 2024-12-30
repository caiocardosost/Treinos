public class InvalidNumberException extends Exception {
    public InvalidNumberException (int x){
        super ("O valor " + x + " eh invalido para a operacao escolhida");
    }
    
}
