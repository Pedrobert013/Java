package escola;
public class Classes {
    public static void main(String[] args) throws Exception {
        Alunos aluno = new Alunos();
        aluno.setNome("Jorge");
        aluno.setIdade(12);
        aluno.setSexo("M");
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getSexo());

    
    }
}
