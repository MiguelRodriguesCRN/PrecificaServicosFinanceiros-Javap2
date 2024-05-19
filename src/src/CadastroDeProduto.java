import java.util.Scanner;

public class CadastroDeProduto {

    private ListarProdutos listarProdutos;
    private Scanner scanner;

    public CadastroDeProduto(ListarProdutos listarProdutos) {
        this.listarProdutos = listarProdutos;
        this.scanner = new Scanner(System.in);
    }

    public void cadastrarNovoProduto() {
        System.out.print("Por favor, inserir o nome do novo produto: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, inserir o preço do novo produto (use virgula) : ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha residual

        System.out.print("Por favor, inserir a porcentagem de lucro desejada: ");
        double porcentagemLucro = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha residual

        System.out.print("Por favor, inserir a quantidade na caixa comprada: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha residual

        Produto produto = new Produto(nome, preco, porcentagemLucro, quantidade);
        listarProdutos.cadastrarProduto(produto);

        System.out.println("Cadastro finalizado, o novo produto foi adicionado ao inventário");
    }

    public void alterarProduto() {
        System.out.println("Produtos cadastrados:");
        listarProdutos.listagemProdutosComIndice();

        System.out.print("Digite o índice do produto a ser alterado: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha residual

        if (indice >= 0 && indice < listarProdutos.getProdutos().size()) {
            Produto produto = listarProdutos.getProdutos().get(indice);

            System.out.print("Insira o novo nome do produto (atual: " + produto.getNome() + "): ");
            String nome = scanner.nextLine();

            System.out.print("Insira o novo preço do produto (atual: " + produto.getPreco() + "): ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha residual

            System.out.print("Insira a nova porcentagem de lucro (atual: " + produto.getPorcentagemLucro() + "): ");
            double porcentagemLucro = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha residual

            System.out.print("Insira a nova quantidade (atual: " + produto.getQuantidade() + "): ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha residual

            // Atualizar os valores do produto
            listarProdutos.atualizarProduto(indice, new Produto(nome, preco, porcentagemLucro, quantidade));

            System.out.println("Produto atualizado com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void encerrar() {
        scanner.close();
    }
}
