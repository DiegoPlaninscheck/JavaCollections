public class Pessoa implements  Comparable{

    int cpf;
    String nome;
    int idade;

    public Pessoa(int cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Object o) {
        Pessoa outra = (Pessoa) o;
        return this.idade - outra.idade;
    }

    @Override
    public boolean equals(Object o) {
        Pessoa outra = (Pessoa) o;
        return this.cpf == (outra.cpf);
    }

    @Override
    public int hashCode() {
        return cpf;
    }

    @Override
    public String toString() {
        return "\nPessoa{" + "\n" +
                "CPF: " + cpf + '\n' +
                "NOME: " + nome + '\n' +
                "IDADE: " + idade +
                '\n' + "}";
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
