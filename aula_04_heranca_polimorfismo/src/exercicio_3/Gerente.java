package exercicio_3;

public class Gerente extends Funcionario{
    public Gerente(String nome, float salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    @Override
    public float calcularSalario() {
        return this.salarioBase+2000;
    }

    @Override
    public float calcularBonus(){
        return this.salarioBase*1.25f;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
