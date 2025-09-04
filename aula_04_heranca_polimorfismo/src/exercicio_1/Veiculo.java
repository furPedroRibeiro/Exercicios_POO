package exercicio_1;

public abstract class Veiculo {
    protected String[] verificacoes;
    public Veiculo(){

    }
    public abstract void listarVerificacoes();
    public abstract boolean ajustar();
    public abstract void limpar();
}
