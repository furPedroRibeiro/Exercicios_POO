package exercicio_1;

public class Oficina {
    private Veiculo[] v;
    private int proximo;
    {
        proximo = 0;
    }

    public Veiculo proximo(){
        this.proximo++;
        return v[proximo];
    }
    public void manutencao(Veiculo v){
        if(v instanceof Bicicleta){
            v.listarVerificacoes();
            ((Bicicleta) v).getFabricante();
            v.ajustar();
            v.limpar();
        } else if(v instanceof Automovel){
            v.listarVerificacoes();
            v.ajustar();
            v.limpar();
            ((Automovel) v).trocarOleo();
        }
    }
}
