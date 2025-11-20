import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        Lutador vc = null;
        Lutador op = null;
        int numeroRandom = random.nextInt(3) + 1;

        System.out.println("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.println("---------------");

        System.out.println("Escolha sua raça: ");
        System.out.println("1: Orc - Mais forte, mais vida, magia fraca");
        System.out.println("2: Imperial - Status medianos");
        System.out.println("3: Khajiit - Mais fracos, menos vida, magia forte");
        int opcao = sc.nextInt();

        System.out.println("---------------");

        switch (opcao) {
            case 1: {
                vc = new Orc(nome);
                break;
            }

            case 2: {
                vc = new Imperial(nome);
                break;
            }

            case 3: {
                vc = new Khajiit(nome);
            }
        }

        switch (numeroRandom) {
            case 1: {
                op = new Orc("Orc");
                break;
            }

            case 2: {
                op = new Imperial("Imperial");
                break;
            }

            case 3: {
                op = new Khajiit("Khajiit");
            }
        }

        System.out.println("Ao andar pelas florestas de Skyrim, você se depara com um " + op.getNome() + " bandido.");
        System.out.println();

        System.out.println(op.getNome() + ": Entregue seus objetos de valor ou eu te esquartejo como um peixe.");
        System.out.println("---------------");

        System.out.println("Você: ");
        vc.mostrarStatus();
        System.out.println("---------------");
        System.out.println("Inimigo: ");
        op.mostrarStatus();
        System.out.println("---------------");

        System.out.println("O que deseja fazer?");

    }
}