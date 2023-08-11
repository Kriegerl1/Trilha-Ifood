package src.lojas;
import src.animais.Animal;
import src.animais.Cachorro;
import src.animais.Gato;

public class Petshop{
    
    //Métodos
    public static void banho(Animal animal){

        animal.setTemperamento("Limpo");
    }

    public static void tosar(Cachorro cachorro){

        cachorro.setTemperamento("tosado");
    }

    public static void surrar(Gato gato){
        gato.setTemperamento("Normal, gato é o bichão mesmo!!");
    }
}
