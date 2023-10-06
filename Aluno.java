package questao2;
class Aluno extends Pessoa {
    private int periodo;
    private int turma;

    public Aluno (int periodo, int turma) {
        this.periodo = periodo;
        this.turma = turma;
    }

    public String mostraAluno() {
        return "Nome: " + getNome() + ", Email: " + getEmail() + ", Período: " + periodo + ", Turma: " + turma;
    }

}

