package exercicio;

public class Professor extends Pessoa{
    Veiculo v;
    public Professor(int cpf, String nome){
        super(cpf, nome);
        v = null;
    }
    public void setVeiculo(Veiculo veiculo){
        this.v = veiculo;
    }
    public String toString(){
        return super.toString() + this.v;
    }
}
