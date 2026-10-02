import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        morse arvore = new morse();
        arvore.inicializar();
        arvore.carregarTabelaMorsePadrao();

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("1. Descodificar mensagem em codigo Morse");
            System.out.println("2. Buscar caractere por sequencia morse (ex: '...')");
            System.out.println("3. Exibir estrutura da árvore binaria");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Introduza a mensagem em Morse: ");
                    String mensagem = scanner.nextLine();
                    String resultado = arvore.decodificar(mensagem);
                    System.out.println("Mensagem descodificada: " + resultado);
                    break;

                case 2:
                    System.out.print("Introduza a sequencia de pontos e traços (ex: '---'): ");
                    String codigo = scanner.nextLine().trim();
                    String caractereEncontrado = arvore.buscar(codigo);
                    if (caractereEncontrado != null) {
                        System.out.println("Caractere correspondente : " + caractereEncontrado);
                    } else {
                        System.out.println("Nenhum caractere encontrado para a sequencia.");
                    }
                    break;

                case 3:
                    arvore.Exibir();
                    break;

                case 0:
                    System.out.println("Programa encerrado com sucesso.");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, escolha um número válido.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}