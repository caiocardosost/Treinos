public class Alunos_pos extends Alunos{
    private String orientador;
    private String programa;

    Alunos_pos(String nome, int ra, String dataNasc, String orientador, String programa){
        this.nome = nome;
        this.ra = ra;
        this.dataNasc = dataNasc;
        this.orientador = orientador;
        this.programa = programa;
    }

    @Override public String toString(){
        return super.toString() + String.format("Aluno de Pos-Graduacao \n") +
        String.format("Orientador: %s\n", orientador) +
        String.format("Programa: %s\n", programa);
    }
    
}
