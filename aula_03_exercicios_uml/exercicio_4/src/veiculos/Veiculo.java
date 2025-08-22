package veiculos;

public class Veiculo {
    protected String marca;
    protected String placa;
    private int km;
    private int qtdComb;
    public Veiculo(String marca, String placa){
        this.marca = marca;
        this.placa = placa;
        km = 0;
        qtdComb = 0;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.placa;
    }
    public String toString(){
        return "\nVeículo\n\nMarca: " + this.marca + "\nPlaca: " + this.placa + "\nDesempenho: " + calculaDesempenho() + "km/l";
    }
    private float calculaDesempenho(){
        if(this.qtdComb == 0) return 0.0f;
        return (float)this.km/(float)this.qtdComb;
    }
    public boolean fazViagem(int ikm, int iqtdComb){
        if(this.km<200){
            this.km += ikm;
        } else{
            System.out.println("Autonomia ultrapassada");
            return false;
        }
        if (iqtdComb>20){
            System.out.println("Tanque ultrapassado");
            return false;
        } else{
            this.qtdComb = iqtdComb;
            return true;
        }
    }
}
