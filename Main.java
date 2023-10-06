package questao2;
public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor(30.0f, 20);
        professor.setNome("Vinicius");
        professor.setEmail("Vinicius@example.com");
        System.out.println(professor.mostraProfessor());

        Aluno aluno = new Aluno(2, 101);
        aluno.setNome("Michele");
        aluno.setEmail("Michele@example.com");

        System.out.println(aluno.mostraAluno());
    }
}
