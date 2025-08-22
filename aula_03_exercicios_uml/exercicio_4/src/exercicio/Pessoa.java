package exercicio;

public class Pessoa {
    int cpf;
    String nome;
    public Pessoa(int cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    public String toString(){
        return "\nPessoa\nNome: " + this.nome + "\nCPF: " + this.cpf;
    }
}
