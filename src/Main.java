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

        while (vc.vida > 0 || op.vida > 0) {
            System.out.println("Você: ");
            vc.mostrarStatus();
            System.out.println("---------------");
            System.out.println("Inimigo: ");
            op.mostrarStatus();
            System.out.println("---------------");

            System.out.println("O que deseja fazer?");
            System.out.println("1 - Atacar");
            System.out.println("2 - Usar magia");
            System.out.println("3 - Defender");
            int escolha = sc.nextInt();    
            
            switch (escolha) {
                case 1: {
                    vc.atacar(op);
                    System.out.println("---------------");
                    System.out.println("Você ataca o inimigo, causando " + vc.calcularDano() + " de dano.");
                    System.out.println("---------------");
                    break;
                }
                case 2: {
                    if (vc.magicka <= 0) {
                        System.out.println("---------------");
                        System.out.println("Você tenta usar sua magia, porém não tem magicka o suficiente.");
                        System.out.println("---------------");
                    } {
                        vc.magia(op);
                        System.out.println("---------------");
                        System.out.println("Você concentra toda sua magicka e lança um feitiço contra o inimigo, causando " + vc.calcularMagia() + " de dano.");
                        System.out.println("---------------");
                    }
                    break;
                }
                case 3: {
                    vc.defender();
                    System.out.println("---------------");
                    System.out.println("Você se defende e ganha 5 pontos de magicka.");
                    System.out.println("---------------");
                }
            }

            int opEscolha = random.nextInt(3) + 1;
            switch (opEscolha) {
                case 1:
                    op.atacar(vc);
                    System.out.println("---------------");
                    System.out.println("O inimigo te ataca, causando " + op.calcularDano() + " de dano.");
                    System.out.println("---------------");
                    break;
                case 2:
                    if (op.magicka <= 0) {
                        System.out.println("---------------");
                        System.out.println("O inimigo tenta usar uma magia, porém não tem magicka o suficiente.");
                        System.out.println("---------------");
                    } {
                        op.magia(vc);
                        System.out.println("---------------");
                        System.out.println("O inimigo concentra toda sua magicka e lança um feitiço contra você, causando " + op.calcularMagia() + " de dano.");
                        System.out.println("---------------");
                    }
                    break;
                case 3: {
                    op.defender();
                    System.out.println("---------------");
                    System.out.println("O inimigo se defende e ganha 5 pontos de magicka.");
                    System.out.println("---------------");
                }
            }
        }

        if (op.vida <= 0) {
            System.out.println("O inimigo desmaiou!");
            System.out.println("Você ganhou (e ainda conseguiu não ser roubado)!");
        } else if (vc.vida <= 0) {
            System.out.println("Você desmaiou (e ainda foi roubado)!");
        }
    }
}