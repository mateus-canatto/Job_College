public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String aluno, int matricula){
        this.nome = aluno;
        this.matricula = matricula;
    }

    public String getAluno(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }
}
