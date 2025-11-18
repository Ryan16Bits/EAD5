//Lutador Pesado

public class Orc extends Lutador {

    public Orc (String nome, double vida, int energia, int forca) {
        super(nome,vida,energia,forca);
        this.setVida(200);
        this.setEnergia(50);
        this.setForca(25);
        this.setMultiplicacoForca(1.5);
    }

    @Override
    public double calcularDano() {
        return super.getForca() * super.getMultiplicacoForca();
    }
}