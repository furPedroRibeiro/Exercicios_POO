package exercicio;

public class Main {
    public static void main(String[] args){
        Carro audi = new Carro("Audi", "XYZ-6969", 4);
        audi.fazViagem(120, 14);
        System.out.println(audi);
        System.out.println("\n");
        Moto biz = new Moto("Biz", "ABC-7777", true);
        System.out.println(biz);
        biz.fazViagem(120, 14);
        System.out.println(biz);

        Carro audiNovo = audi;
        System.out.println(audiNovo);

        Veiculo audi3 = audiNovo;
        System.out.println(audi3);

        Professor p1 = new Professor(450510, "João da silva");
        p1.setVeiculo(audi3);
        System.out.println(p1);
    }
}
