package veiculos;

public class Carro extends Veiculo {
    int numDePortas;

    public Carro(String marca, String placa, int portas){
        super(marca, placa);
        this.numDePortas = portas;
    }
    public int getNumDePortas(){
        return this.numDePortas;
    }
    public String toString(){
        return super.toString() + "\nPortas: " + this.numDePortas;
    }
}
