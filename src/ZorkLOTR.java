java
import java.util.Scanner; // Classe Scanner: lê entrada do usuário (números, texto)

public class ZorkLOTR {
    public static void main(String[] args) {
        // Tipo primitivo boolean: true/false, controla se o jogo continua
        boolean jogoAtivo = true;
        // Classe Scanner: cria objeto para ler escolhas
        Scanner scanner = new Scanner(System.in);
        // Tipo primitivo int: armazena a escolha do usuário
        int escolha;
        
        // Introdução com citação do livro
        System.out.println("*** Bem-vindo a 'A Jornada de Frodo' ***");
        System.out.println("Você é Frodo Bolseiro, um hobbit do Condado.");
        System.out.println("\"Um hobbit de aparência jovem, com olhos brilhantes.\"");
        
        while (jogoAtivo) {
            // Cena 1: A Festa de Aniversário (Capítulo 1)
            System.out.println("\n=== A Festa de Aniversário ===");
            System.out.println("Bilbo, seu tio, faz 111 anos e desaparece usando um anel!");
            System.out.println("\"Eu não me encaixo mais aqui!\", diz Bilbo.");
            System.out.println("Você herda um anel misterioso. O que faz?");
            System.out.println("1. Guardar o anel em segredo.");
            System.out.println("2. Mostrar aos amigos (Merry e Pippin).");
            System.out.println("3. Procurar Gandalf.");
            System.out.print("Escolha (1-3): ");
            
            // Try-catch: evita erro se o usuário digitar algo inválido (ex.: letras)
            try {
                escolha = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Digite 1, 2 ou 3!");
                scanner.nextLine(); // Limpa o buffer
                continue;
            }
            
            // Switch: verifica a escolha e executa a ação
            switch (escolha) {
                case 1:
                    System.out.println("\nVocê guarda o anel, mas sente um peso.");
                    cenaGandalf(scanner);
                    break;
                case 2:
                    System.out.println("\nSeus amigos espalham a notícia. Nazgûl aparecem!");
                    System.out.println("*** Fim: Capturado pelos Nazgûl! ***");
                    jogoAtivo = false;
                    break;
                case 3:
                    System.out.println("\nVocê procura Gandalf para entender o anel.");
                    cenaGandalf(scanner);
                    break;
                default:
                    System.out.println("Erro: Escolha 1, 2 ou 3!");
                    continue;
            }
        }
        scanner.close(); // Fecha o Scanner
    }
    
    // Método para a Cena 2: A Sombra do Passado
    private static void cenaGandalf(Scanner scanner) {
        // Tipo primitivo boolean: controla o loop da cena
        boolean cenaAtiva = true;
        
        System.out.println("\n=== A Sombra do Passado ===");
        System.out.println("Gandalf revela: \"Este é o Anel Mestre, de Sauron!\"");
        System.out.println("O Condado não é seguro. O que você faz?");
        System.out.println("1. Partir para Valfenda com o anel.");
        System.out.println("2. Esconder o anel no Condado.");
        System.out.println("3. Dar o anel a Gandalf.");
        System.out.print("Escolha (1-3): ");
        
        while (cenaAtiva) {
            int escolha;
            try {
                escolha = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Digite 1, 2 ou 3!");
                scanner.nextLine();
                continue;
            }
            
            switch (escolha) {
                case 1:
                    System.out.println("\nVocê parte com Sam para Valfenda.");
                    cenaPartida(scanner);
                    cenaAtiva = false;
                    break;
                case 2:
                    System.out.println("\nNazgûl encontram o anel!");
                    System.out.println("*** Fim: Capturado! ***");
                    cenaAtiva = false;
                    break;
                case 3:
                    System.out.println("\nGandalf diz: \"Não me tente!\"");
                    cenaPartida(scanner);
                    cenaAtiva = false;
                    break;
                default:
                    System.out.println("Erro: Escolha 1, 2 ou 3!");
            }
        }
    }
    
    // Método para a Cena 3: Três não é Demais
    private static void cenaPartida(Scanner scanner) {
        System.out.println("\n=== Três não é Demais ===");
        System.out.println("Você, Sam e Pippin partem do Condado.");
        System.out.println("\"Hobbits não são confiáveis em aventuras\", ri Pippin.");
        System.out.println("Figuras escuras (Nazgûl?) aparecem. O que faz?");
        System.out.println("1. Esconder-se nos arbustos.");
        System.out.println("2. Correr para a Floresta Velha.");
        System.out.println("3. Enfrentar na estrada.");
        System.out.print("Escolha (1-3): ");
        
        int escolha;
        try {
            escolha = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Erro: Digite 1, 2 ou 3!");
            scanner.nextLine();
            return;
        }
        
        switch (escolha) {
            case 1:
                System.out.println("\nVocê se esconde. Os Nazgûl passam!");
                System.out.println("*** Fim: Você segue para Valfenda! ***");
                break;
            case 2:
                System.out.println("\nA Floresta Velha é hostil. Um salgueiro te captura!");
                System.out.println("*** Fim: Preso! ***");
                break;
            case 3:
                System.out.println("\nOs Nazgûl são implacáveis!");
                System.out.println("*** Fim: Capturado! ***");
                break;
            default:
                System.out.println("Erro: Escolha 1, 2 ou 3!");
        }
    }
}