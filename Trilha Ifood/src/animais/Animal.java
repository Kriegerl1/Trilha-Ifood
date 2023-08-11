package src.animais;

public class Animal {

    // Atributos

    protected String nome;
    protected String cor;
    protected String raca;
    protected int altura;
    protected double peso;
    protected String temperamento;

    // Métodos
    public Animal(String nome, String cor, String raca, int altura, double peso, String temperamento) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.altura = altura;
        this.peso = peso;
        this.temperamento = temperamento;
    }

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

    public void setRaca(String raca){
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
        temperamento = "deboas";
        this.temperamento = temperamento;
    }

    protected void comer() {
        System.out.println("ComecomeCome");
    }

    public void soar() {
        System.out.println("Cri cri ");
    }

    protected void dormir() {
        System.out.println("ZZZzzzZZzzzZ");
    }

    @Override
    public String toString() {

        return "O animal, se chama: " + nome;
    }

    public Object setNum() {
        return null;
    }
}
