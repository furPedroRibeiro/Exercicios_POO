package exercicio_1;

public class Automovel extends Veiculo {
    public String placa;
    public Automovel(String[] verificacoes){
        this.verificacoes = verificacoes;
        this.placa = placa;
    }

    public boolean trocarOleo(){
        return true;
    }

    @Override
    public void listarVerificacoes() {
        System.out.println("Verificações: "+this.verificacoes);
    }

    @Override
    public boolean ajustar() {
        return true;
    }

    @Override
    public void limpar() {
        System.out.println("Limpo.");
    }
}
