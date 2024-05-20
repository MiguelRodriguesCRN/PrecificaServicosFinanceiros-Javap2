import javax.swing.JOptionPane;
import java.util.Iterator;
import java.util.List;

public class DeletarProdutos {

    private List<Produto> produtos;

    public DeletarProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void deletarProdutoPorNome(String nome) {
        boolean produtoEncontrado = false;

        for (Iterator<Produto> iterator = produtos.iterator(); iterator.hasNext();) {
            Produto produto = iterator.next();
            if (produto.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                produtoEncontrado = true;
                JOptionPane.showMessageDialog(null, "Produto deletado com sucesso: " + nome, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }

        if (!produtoEncontrado) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado: " + nome, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
