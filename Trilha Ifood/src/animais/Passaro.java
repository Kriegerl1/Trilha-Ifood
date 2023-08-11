package src.animais;

public class Passaro extends Animal {

    // Atributos

    static int numPassaros;

    // Contrutor

    public Passaro(String nome, String cor, String raca, int altura, double peso, String temperamento) {
        super(nome, cor, raca, altura, peso, temperamento);
        numPassaros++;
    }

    // Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTemperament() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void soar() {
        System.out.println("Says: Piu Piupiu");
    }

}