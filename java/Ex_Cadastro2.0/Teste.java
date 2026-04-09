public public class Teste {
    public static void main(String[] args){
        Turma t1 = new Turma("BES", "3");
        Turma t2 = new Turma("BEC", "2");

        Aluno a1 = new Aluno("Joao", 6767);
        Aluno a2 = new Aluno("Maria", 6688);
        Aluno a3 = new Aluno("Arthur", 7777);
        Aluno a4 = new Aluno("Murilo", 4444);
        Aluno a5 = new Aluno("Mateus", 8545);

        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);
        t1.adicionarAluno(a3);
        t1.adicionarAluno(a4);
        t1.adicionarAluno(a5);

        Aluno a6 = new Aluno("Victor", 1234);
        Aluno a7 = new Aluno("Daniel", 4567);
        Aluno a8 = new Aluno("Renan", 0000);
        Aluno a9 = new Aluno("Luiz", 1111);
        Aluno a10 = new Aluno("Marcelo", 2020);

        t2.adicionarAluno(a6);
        t2.adicionarAluno(a7);
        t2.adicionarAluno(a8);
        t2.adicionarAluno(a9);
        t2.adicionarAluno(a10);

        t1.listarAlunos();
        System.out.println("------------------");
        t2.listarAlunos();
    }
}
 {
    
}
