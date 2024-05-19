import java.util.ArrayList;
import java.util.List;

public class ListarProdutos {

    private List<Produto> produtos;

    public ListarProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void atualizarProduto(int indice, Produto produto) {
        produtos.set(indice, produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void listagemProdutos() {
        System.out.println("Produtos cadastrados:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void listagemProdutosComIndice() {
        System.out.println("Produtos cadastrados:");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(i + ": " + produtos.get(i));
        }
    }

    // Metodo para pesquisar o produto, usando como parametro o nome
    public Produto pesquisarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
