import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        ListarProdutos listagemProdutos = new ListarProdutos();
        CadastroDeProduto cadastrarNovoProduto = new CadastroDeProduto(listagemProdutos);
        int opcao;

        boolean executando = true;
        boolean logado = false;

        while (executando) {
            if (!logado) {
                System.out.println("1. Cadastrar");
                System.out.println("2. Login");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                int loginUsuario = scanner.nextInt();
                scanner.nextLine();

                switch (loginUsuario) {
                    case 1:
                        System.out.print("Digite o nome do usuário: ");
                        String novoUsuario = scanner.nextLine();
                        System.out.print("Digite a senha: ");
                        String novaSenha = scanner.nextLine();
                        login.cadastrarUsuario(novoUsuario, novaSenha);
                        break;
                    case 2:
                        System.out.print("Digite seu nome de usuário: ");
                        String username = scanner.nextLine();
                        System.out.print("Digite a senha: ");
                        String senha = scanner.nextLine();
                        if (login.autenticar(username, senha)) {
                            System.out.println("Login bem sucedido! \n");
                            logado = true;
                        } else {
                            System.out.println("Nome de usuário ou senha incorretos!");
                        }
                        break;
                    case 3:
                        executando = false;
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
            } else {
                System.out.println("Iniciando aplicação");
                do {
                    System.out.println("\n1. Cadastrar Produto");
                    System.out.println("2. Listar Produtos");
                    System.out.println("3. Pesquisar Produto por Nome");
                    System.out.println("0. Sair");
                    System.out.print("Escolha uma opção: ");
                    opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1:
                            cadastrarNovoProduto.cadastrarNovoProduto();
                            break;
                        case 2:
                            listagemProdutos.listagemProdutos();
                            break;
                        case 3:
                            System.out.print("Digite o nome do produto: ");
                            String nomeProduto = scanner.nextLine();
                            Produto produtoEncontradoNome = listagemProdutos.pesquisarProduto(nomeProduto);
                            if (produtoEncontradoNome != null) {
                                System.out.println("Produto encontrado: " + produtoEncontradoNome);
                            } else {
                                System.out.println("Produto não encontrado.");
                            }
                            break;

                        case 0:
                            logado = false;
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                } while (opcao != 0);
            }
        }
        scanner.close();
    }
}


