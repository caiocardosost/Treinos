public class main_Alunos {
    public static void main(String[] args) {
        Alunos_grad a1 = new Alunos_grad("Caio Cardoso dos Santos", 112020, "13/03/1997", "Ciencia da computacao");
        Alunos_pos a2 = new Alunos_pos("Ana Clara Santos", 123456, "15/03/2001", "Dr. Marcelo Oliveira", "Mestrado em Ciências da Computação");
        Alunos_pos a3 = new Alunos_pos("Lucas Henrique Almeida", 654321, "22/07/1998", "Dra. Renata Silva", "Doutorado em Engenharia Elétrica");
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
