package src.animais;

public class Gato extends Animal {
    
    //Atributos

    static int numGatos;

    //Construtor

    public Gato(String nome, String cor, String raca, int altura, double peso, String temperamento){
        super(nome, cor, raca, altura, peso, temperamento);
        numGatos++;
    }
    
    //Métodos
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getRaca(){
        return raca;
    }

    public void getRaca(String raca){
        this.raca = raca;
    }

    public int getAltura(){
        return altura;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getTemperamento(){
        return temperamento;
    }

    public void setTemperamento(String temperamento){
        this.temperamento = temperamento;
    }
    @Override
    public void soar(){
        System.out.println("Says: Meow Meow");
    }
    
}

