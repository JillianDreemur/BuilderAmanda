public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa usando o Builder
        Pessoa pessoa1 = new Pessoa.PessoaBuilder()
                .setNome("João Bezerra de Sousa Neto")
                .setCpf("123.456.789-00")
                .setRg("12.345.678-9")
                .setEmail("joao.neto@example.com")
                .setTelefone("(11) 98765-4321")
                .setIdade(30)
                .setEndereco("Rua Pedro Américo, 46")
                .build();

        System.out.println(pessoa1);

        // Criando outra instância de Pessoa com atributos diferentes
        Pessoa pessoa2 = new Pessoa.PessoaBuilder()
                .setNome("Mariana de Freitas Albuquerque")
                .setEmail("marifalb2004@gmail.com")
                .setIdade(25)
                .build();

        System.out.println(pessoa2);
    }
}
