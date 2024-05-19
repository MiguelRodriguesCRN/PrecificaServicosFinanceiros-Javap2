import java.util.ArrayList;
import java.util.List;

//Criando classe de listagem de produtos-------------------------------------
public class ListarProdutos{

    //usando list
    private List<Produto> produtos;

    //usando array
    public ListarProdutos() {
        produtos = new ArrayList<>();
    }
    //metodo de cadastro de um novo produto
    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }
    //metodo de listagem
    public void listagemProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
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
