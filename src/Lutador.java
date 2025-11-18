public abstract class Lutador {
    private String nome;
    private double vida;
    private int energia;
    private int forca;
    private double multiplicacoForca;

    public Lutador (String nome, double vida, int energia, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.forca = forca;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return this.vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return this.energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getForca() {
        return this.energia;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public double getMultiplicacoForca() {
        return this.multiplicacoForca;
    }

    public void setMultiplicacoForca(double multiplicacoForca) {
        this.multiplicacoForca = multiplicacoForca;
    }

    public abstract void atacar(Lutador oponente);

    public abstract void especial(Lutador oponente);

    public abstract void defender();

    public abstract void mostrarStatus();

    public abstract boolean estarVivo();

    public abstract int calcularDano
}
