import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nomeTurma;
    private String periodo;
    private List<Aluno> listaAlunos;

    public Turma(String nomeTurma, String periodo) {
        this.nomeTurma = nomeTurma;
        this.periodo = periodo;
        this.listaAlunos = new ArrayList<>();
    }

    void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void listarAlunos(){
        System.out.println("-------------------------");
        System.out.println("Turma: " + nomeTurma + " - Periodo: " + periodo);
        System.out.println("-------------------------");

        for(Aluno aluno : listaAlunos) {
            System.out.println("Alunos: " + aluno.getAluno() +" - Matricula: " + aluno.getMatricula());
        }
    }
}