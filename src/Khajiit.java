//Lutador Leve

public class Khajiit extends Lutador {

    public Khajiit (String nome) {
        super(nome);
        this.vida = 200;
        this.magicka = 25;
        this.forca = 25;
        this.multiplicacaoForca = 0.5;
        this.multiplicacaoEspecial = 1.5;
    }

    @Override
    public double calcularDano() {
        return this.forca * this.multiplicacaoForca;
    }

    @Override
    public double calcularMagia() {
        return this.magicka * this.multiplicacaoEspecial;
    }

    @Override
    public void atacar(Lutador op) {
        op.vida -= calcularDano();
    }

    @Override
    public void magia(Lutador op) {
        op.vida -= calcularMagia();
    }

    @Override
    public void defender() {
        this.magicka += 5;
    }

    @Override
    public void mostrarStatus() {
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + this.vida);
        System.out.println("Magicka: " + this.magicka);
    }

    @Override
    public boolean estarVivo() {
        if (this.vida > 0) {
            return true;
        }
        return false;
    }
}




