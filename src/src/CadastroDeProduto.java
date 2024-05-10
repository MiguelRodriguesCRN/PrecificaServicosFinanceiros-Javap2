import java.util.Scanner;

   //Classe CadastroDeProduto
public class CadastroDeProduto {

    //buscando método listarProdutos
    private ListarProdutos listarProdutos;
    private Scanner scanner;

    //construtor que configura a classe CadastroDeProduto
    public CadastroDeProduto(ListarProdutos listarProdutos) {
        this.listarProdutos = listarProdutos;
        this.scanner = new Scanner(System.in);
    }

    //metodo que colhe informações do produto
    public void cadastrarNovoProduto() {
        System.out.print("Por favor, inserir o nome do novo produto: ");
        String nome = scanner.nextLine();
        System.out.print("Por favor, inserir o preço do novo produto: ");
        double preco = scanner.nextDouble();
        //criação e adição à lista usando informações colhidas acima
        Produto produto = new Produto( nome, preco);
        listarProdutos.cadastrarProduto(produto);
        System.out.println("Cadastro finalizado, o novo produto foi adicionado ao inventário");
    }

    public void encerrar() {
        scanner.close();
    }
}

