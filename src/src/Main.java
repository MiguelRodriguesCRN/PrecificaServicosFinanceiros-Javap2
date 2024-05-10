import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello World 2 TESTEEEEE FUNCIONE");

//-------------------------Cadastro e Listagem de PRODUTOS---------------------------------------------------------------


        //SwichCase Teste para as Classes CadastroDeProduto e ListarProdutos
        //Deus por favor faz isso funcionar dessa vez eu nao aguento mais

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