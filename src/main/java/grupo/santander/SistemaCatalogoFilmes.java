package grupo.santander;

import java.util.Scanner;

public class SistemaCatalogoFilmes {
    private static SistemaCinema sistema = new SistemaCinema();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consome a linha restante

            switch (opcao) {
                case 1:
                    cadastrarFilme();
                    break;
                case 2:
                    cadastrarAtor();
                    break;
                case 3:
                    cadastrarDiretor();
                    break;
                case 4:
                    associarAtorAFilme();
                    break;
                case 5:
                    definirDiretorParaFilme();
                    break;
                case 6:
                    buscarFilmePorNome();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n--- SISTEMA DE CINEMA ---");
        System.out.println("1. Cadastrar Filme");
        System.out.println("2. Cadastrar Ator");
        System.out.println("3. Cadastrar Diretor");
        System.out.println("4. Associar Ator a Filme");
        System.out.println("5. Definir Diretor para Filme");
        System.out.println("6. Buscar Filme por Nome");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarFilme() {
        System.out.print("Digite o nome do filme: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a data de lançamento (DD/MM/AAAA): ");
        String dataLancamento = scanner.nextLine();

        System.out.print("Digite o orçamento do filme: ");
        double orcamento = scanner.nextDouble();
        scanner.nextLine();  // Consumir linha restante

        System.out.print("Digite a descrição do filme: ");
        String descricao = scanner.nextLine();

        Filme filme = new Filme(nome, dataLancamento, orcamento, descricao);
        sistema.cadastrarFilme(filme);
        System.out.println("Filme cadastrado com sucesso!");
    }

    private static void cadastrarAtor() {
        System.out.print("Digite o nome do ator: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a data de nascimento do ator (DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine();

        Ator ator = new Ator(nome, dataNascimento); // Usando dois parâmetros aqui
        sistema.cadastrarAtor(ator);
        System.out.println("Ator cadastrado com sucesso!");
    }


    private static void cadastrarDiretor() {
        System.out.print("Digite o nome do diretor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a data de nascimento do diretor (DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine();

        Diretor diretor = new Diretor(nome, dataNascimento); // Usando dois parâmetros aqui
        sistema.cadastrarDiretor(diretor);
        System.out.println("Diretor cadastrado com sucesso!");
    }


    private static void associarAtorAFilme() {
        System.out.print("Digite o nome do filme: ");
        String nomeFilme = scanner.nextLine();

        System.out.print("Digite o nome do ator: ");
        String nomeAtor = scanner.nextLine();

        Ator ator = sistema.listarAtores().stream().filter(a -> a.getNome().equalsIgnoreCase(nomeAtor)).findFirst().orElse(null);
        if (ator != null) {
            if (sistema.associarAtorAFilme(nomeFilme, ator)) {
                System.out.println("Ator associado com sucesso ao filme!");
            } else {
                System.out.println("Erro ao associar o ator ao filme. Verifique os detalhes e tente novamente.");
            }
        } else {
            System.out.println("Ator não encontrado.");
        }
    }

    private static void definirDiretorParaFilme() {
        System.out.print("Digite o nome do filme: ");
        String nomeFilme = scanner.nextLine();

        System.out.print("Digite o nome do diretor: ");
        String nomeDiretor = scanner.nextLine();

        Diretor diretor = sistema.listarDiretores().stream().filter(d -> d.getNome().equalsIgnoreCase(nomeDiretor)).findFirst().orElse(null);
        if (diretor != null) {
            if (sistema.definirDiretorParaFilme(nomeFilme, diretor)) {
                System.out.println("Diretor definido com sucesso para o filme!");
            } else {
                System.out.println("Erro ao definir o diretor para o filme. Verifique os detalhes e tente novamente.");
            }
        } else {
            System.out.println("Diretor não encontrado.");
        }
    }

    private static void buscarFilmePorNome() {
        System.out.print("Digite o nome do filme que deseja buscar: ");
        String nome = scanner.nextLine();

        Filme filme = sistema.buscarFilmePorNome(nome);
        if (filme != null) {
            System.out.println(filme);
        } else {
            System.out.println("Filme não encontrado.");
        }
    }
}

