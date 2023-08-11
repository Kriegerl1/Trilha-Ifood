import src.animais.Cachorro;
import src.animais.Passaro;
import src.lojas.Petshop;
import src.animais.Gato;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Bob", "Branco", "poodle", 20, 1.20, "cachorro",20);

        Gato gato1 = new Gato("Chico", "Cinza", "Gato", 18, 3.0, "gato");

        Passaro passaro1 = new Passaro("Tico", "variado", "periquito", 12, 0.2, "Crazy brow");

        // protected String nome;
        // protected String cor;
        // protected String raca;
        // protected int altura;
        // protected double peso;
        // protected String temperamento;

        System.out.println(cachorro1.toString());
        cachorro1.soar();
        System.out.println(gato1.toString());
        gato1.soar();
        System.out.println(passaro1.toString());
        passaro1.soar();

        System.out.println(cachorro1.getTemperamento());
        System.out.println(gato1.getTemperamento());
        System.out.println(passaro1.getTemperamento());

        Petshop.banho(gato1);
        System.out.println(gato1.getTemperamento());
        Petshop.banho(cachorro1);
        System.out.println(cachorro1.getTemperamento());
        Petshop.surrar(gato1);
        System.out.println(gato1.getTemperamento());

    }
}