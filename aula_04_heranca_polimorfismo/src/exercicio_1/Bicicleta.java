package exercicio_1;

public class Bicicleta extends Veiculo{
    public String fabricante;
    public Bicicleta(String[] verificacoes, String fabricante){
        this.verificacoes = verificacoes;
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return this.fabricante;
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
