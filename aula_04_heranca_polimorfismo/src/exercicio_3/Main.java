package exercicio_3;

public class Main {
    public static void main(String[] args){
        Funcionario[] fs = new Funcionario[3];
        fs[0] = new Estagiario("Matheus", 1600);
        fs[1] = new Gerente("Vinicius", 1600);
        fs[2] = new Vendedor("Pedro", 1600, 50, 12);

        for (Funcionario f: fs) {
            System.out.println(f);
            System.out.println("Salário calculado: "+f.calcularSalario());
            System.out.println("Bônus: "+f.calcularBonus());
        }
    }
}
