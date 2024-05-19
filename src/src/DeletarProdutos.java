import java.util.Iterator;
import java.util.List;

public class DeletarProdutos { private ListarProdutos listarProdutos;

    public DeletarProdutos(ListarProdutos listarProdutos) {
        this.listarProdutos = listarProdutos;
    }

    public void deletarProdutoPorNome(String nome) {
        List<Produto> produtos = listarProdutos.getProdutos();
        boolean produtoEncontrado = false;

        for (Iterator<Produto> iterator = produtos.iterator(); iterator.hasNext();) {
            Produto produto = iterator.next();
            if (produto.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                produtoEncontrado = true;
                System.out.println("Produto deletado com sucesso: " + nome);
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado: " + nome);
        }
    }
}

