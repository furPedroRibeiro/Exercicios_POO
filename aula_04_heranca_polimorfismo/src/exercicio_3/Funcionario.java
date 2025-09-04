package exercicio_3;

public abstract class Funcionario {
    String nome;
    float salarioBase;

    public float calcularSalario(){
        return this.salarioBase;
    }
    public abstract float calcularBonus();

    public String toString() {
        return "\nNome: "+this.nome+"\nSalário base: "+this.salarioBase;
    }
}
