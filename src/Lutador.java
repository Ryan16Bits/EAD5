public abstract class Lutador {
    private String nome;
    protected double vida;
    protected int magicka;
    protected int forca;
    protected double multiplicacaoForca;
    protected double multiplicacaoEspecial;

    public Lutador (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void atacar(Lutador op);

    public abstract void magia(Lutador op);

    public abstract void defender();

    public abstract void mostrarStatus();

    public abstract boolean estarVivo();

    public abstract double calcularDano();

    public abstract double calcularMagia();
}
