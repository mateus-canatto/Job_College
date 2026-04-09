// Proximos arquivos não usar "static", criar sempre novos arquivos das classes

public class Ex_Cadastro {

    public static class Professor {
        public String nome;
        public String idInstituicao;

        public Professor(String nome, String idInstituicao) {
            this.nome = nome;
            this.idInstituicao = idInstituicao;
        }
    }

    public static class Aluno {
        public String nome;
        public String matricula;

        public Aluno(String nome, String matricula) {
            this.nome = nome;
            this.matricula = matricula;
        }
    }

    public static class Disciplina {
        private String nomeDisciplina;
        private Professor professor;
        private Aluno aluno;

        public Disciplina(String nomeDisciplina, Professor professor, Aluno aluno) {
            this.nomeDisciplina = nomeDisciplina;
            this.professor = professor;
            this.aluno = aluno;
        }

        public void exibirRelatorio() {
            System.out.println("======= RELATÓRIO =======");
            System.out.println("Disciplina: " + this.nomeDisciplina);
            System.out.println("---------------------------------------");
            System.out.println("Professor: " + professor.nome + " (ID: " + professor.idInstituicao + ")");
            System.out.println("Aluno:     " + aluno.nome + " (Matrícula: " + aluno.matricula + ")");
        }
    }

    public static void main(String[] args) {
        Professor prof = new Professor("Abimael", "6767");
        Aluno aluno = new Aluno("Mateus", "0123456");
        Disciplina disc = new Disciplina("POO", prof, aluno);

        disc.exibirRelatorio();
    }
}