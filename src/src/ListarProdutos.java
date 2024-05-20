import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class ListarProdutos {

    private List<Produto> produtos;

    public ListarProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void listagemProdutos() {
        StringBuilder listaProdutos = new StringBuilder("Produtos cadastrados:\n");
        for (Produto produto : produtos) {
            listaProdutos.append(produto).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaProdutos.toString(), "Lista de Produtos", JOptionPane.INFORMATION_MESSAGE);
    }

    public void listagemProdutosComIndice() {
        StringBuilder listaProdutos = new StringBuilder("Produtos cadastrados:\n");
        for (int i = 0; i < produtos.size(); i++) {
            listaProdutos.append(i).append(": ").append(produtos.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaProdutos.toString(), "Lista de Produtos com Índice", JOptionPane.INFORMATION_MESSAGE);
    }

    public Produto pesquisarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
