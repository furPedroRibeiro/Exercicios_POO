package exercicio_3;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, float salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    @Override
    public float calcularBonus(){
        return this.salarioBase*1.1f;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
