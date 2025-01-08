public class Alunos_grad extends Alunos {
    private String curso;

    public Alunos_grad (String nome, int ra, String dataNasc, String curso){
        this.nome = nome;
        this.ra = ra;
        this.dataNasc = dataNasc;
        this.curso = curso;
    }

    @Override public String toString(){
        return super.toString() + String.format("Aluno de Graduacao \n") +
        String.format("Curso: %s\n", curso);
    }
    
}
