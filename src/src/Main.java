import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Criando scanner
        Scanner scanner = new Scanner(System.in);

        //Criando objeto Login
        Login login = new Login();

        //Criando objetos do Produto
        ListarProdutos listagemProdutos = new ListarProdutos();
        CadastroDeProduto cadastrarNovoProduto = new CadastroDeProduto(listagemProdutos);
        int opcao;

        boolean executando = true;
        boolean logado = false;

        // Loop login e cadastro
        while (executando) {
            // O Ponto de exclamação é o operador lógigo de negação (NOT)
            // if (NAOlogado) >> execute o código de login e cadastro
            // else >> tela de cadastro de produto (pq o usuario ta logado tlg)
            if (!logado) {
                System.out.println("1. Cadastrar");
                System.out.println("2. Login");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                int loginUsuario = scanner.nextInt();
                scanner.nextLine();

                // Switch para cada opção escolhida
                switch (loginUsuario) {
                    case 1:
                        System.out.println("Digite o nome do usuário: ");
                        String novoUsuario = scanner.nextLine();
                        System.out.println("Digite a senha:");
                        String novaSenha = scanner.nextLine();
                        login.cadastrarUsuario(novoUsuario, novaSenha);
                        break;
                    case 2:
                        System.out.println("Digite seu nome de usuário: ");
                        String username = scanner.nextLine();
                        System.out.println("Digite a senha: ");
                        String senha = scanner.nextLine();
                        if (login.autenticar(username, senha)) {
                            System.out.println("Login bem sucedido! \n \n");
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
            } else { // Código executado quando o usuário está logado:
                System.out.println("Iniciando aplicação");
                do { // Opções de escolha do usuário
                    System.out.println("\n1. Cadastrar Produto");
                    System.out.println("2. Listar Produtos");
                    System.out.println("0. Sair");
                    System.out.print("Escolha uma opção: ");
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            cadastrarNovoProduto.cadastrarNovoProduto();
                            break;
                        case 2:
                            listagemProdutos.listagemProdutos();
                            break;
                        case 0:
                            cadastrarNovoProduto.encerrar();
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
