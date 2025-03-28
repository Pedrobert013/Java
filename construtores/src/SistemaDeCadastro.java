public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jorge", "35452351525");
        System.out.println(pessoa.getCpf() + pessoa.getNome());
    }
}
