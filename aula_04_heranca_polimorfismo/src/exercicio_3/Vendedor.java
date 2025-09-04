package exercicio_3;

public class Vendedor extends Funcionario {
    private int vendas;
    private float percentualComissao;
    public Vendedor(String nome, float salarioBase, int vendas, float pCom){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.vendas = vendas;
        this.percentualComissao = pCom;
    }
    @Override
    public float calcularBonus(){
        return this.salarioBase*1.05f;
    }
    @Override
    public float calcularSalario() {
        return super.calcularSalario()+(this.vendas*(this.percentualComissao/100));
    }
    @Override
    public String toString() {
        return super.toString()+ "\nVendas: " +this.vendas+"\nComissão: "+this.percentualComissao;
    }
}
