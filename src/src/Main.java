import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//-------------------------Cadastro e Login de USUÁRIOS---------------------------------------------------------------

        Login login = new Login();

        boolean executando = true;
        while (executando) {
            System.out.println("1. Cadastrar");
            System.out.println("2. Login");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
        }

        switch (opcao){
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
                    System.out.println("Login bem sucedido!");
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




//-------------------------Cadastro e Listagem de PRODUTOS---------------------------------------------------------------


        //SwichCase Teste para as Classes CadastroDeProduto e ListarProdutos
        //Deus por favor faz isso funcionar dessa vez eu nao aguento mais
        // deus abençoe galera

        //objetos
        ListarProdutos listagemProdutos = new ListarProdutos();
        CadastroDeProduto cadastrarNovoProduto = new CadastroDeProduto(listagemProdutos);

        Scanner scanner = new Scanner(System.in);
        //variavel da escolha do usuario
        int opcao;

        // criando o loop e as opções para o swicth case
        do {
            System.out.println("\n1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            //criação do swicth case para que usuario possa escolher
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

        scanner.close();
    }
}