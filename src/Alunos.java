public abstract class Alunos {
    protected String nome;
    protected int ra;
    protected String dataNasc;

    public String ToString(){
        return String.format("Nome: %s \n", nome) +
        String.format("ra: %d \n", ra) +
        String.format("data de Nascimento: %s \n", dataNasc);

    }

    
}
