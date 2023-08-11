package src.animais;

public class Cachorro extends Animal {

    // Atributos
    protected int tamDeRabo;
    static int numCachorros;

    // Construtores

    public Cachorro(String nome, String cor, String raca, int altura, double peso, String temperamento, int tamDeRabo) {
        super(nome, cor, raca, altura, peso, temperamento);
        this.tamDeRabo = tamDeRabo;
        numCachorros++;
    }

    // metodos

    public static int getNum() {
        return numCachorros;
    }

    public static void setNum(int numCachorros) {
        Cachorro.numCachorros = numCachorros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public int getTamDeRabo(){
        return tamDeRabo;
    }

    public void setTamDeRabo(int tamDeRabo){
        this.tamDeRabo = tamDeRabo;
    }

    public String pegarBolinha() {
        return "Pegou";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "carinho":
                this.temperamento = "feliz!";
                break;

            case "vai dormir":
                this.temperamento = "bravo!";
                break;

            case "chamar":
                this.temperamento = "indiferente!";
                break;

            default:
                this.temperamento = "cebosta!";
        }

        return temperamento;
    }

    @Override
    public void soar() {
        System.out.println("Says: AUau AuAU");
    }
}
