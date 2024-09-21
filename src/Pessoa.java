public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private String email;
    private String telefone;
    private int idade;
    private String endereco;

    // Construtor privado para ser usado pelo Builder
    private Pessoa(PessoaBuilder builder) {
        this.nome = builder.nome;
        this.cpf = builder.cpf;
        this.rg = builder.rg;
        this.email = builder.email;
        this.telefone = builder.telefone;
        this.idade = builder.idade;
        this.endereco = builder.endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    // Classe interna Builder
    public static class PessoaBuilder {
        private String nome;
        private String cpf;
        private String rg;
        private String email;
        private String telefone;
        private int idade;
        private String endereco;

        public PessoaBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder setCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public PessoaBuilder setRg(String rg) {
            this.rg = rg;
            return this;
        }

        public PessoaBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PessoaBuilder setTelefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public PessoaBuilder setIdade(int idade) {
            this.idade = idade;
            return this;
        }

        public PessoaBuilder setEndereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this);
        }
    }
}
