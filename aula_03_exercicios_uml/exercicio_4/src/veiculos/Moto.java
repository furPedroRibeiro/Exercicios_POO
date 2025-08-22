package veiculos;

public class Moto extends Veiculo{
    boolean eletrica;
    public Moto(String marca, String placa, boolean eletrica){
        super(marca, placa);
        this.eletrica = eletrica;
    }
    public boolean getEletrica(){
        return this.eletrica;
    }
    public String toString(){
        return super.toString() + "\nElétrica: " + this.eletrica;
    }
}
