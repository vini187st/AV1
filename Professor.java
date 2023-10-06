package questao2;
public class Professor extends Pessoa {
    private float salarioHora;
    private int horasAula;

    public Professor(float salarioHora, int horasAula) {
        this.salarioHora = salarioHora;
        this.horasAula = horasAula;
    }
    
    public float calculaSalario() {
        return salarioHora * horasAula;
    }

    public String mostraProfessor() {
        return "Nome: " + getNome() + ", Email: " + getEmail() + ", Salário: " + calculaSalario();
    }
}

