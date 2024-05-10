import java.util.ArrayList;
import java.util.List;

//Criando classe de listagem de produtos
public class ListarProdutos{

    //usando list
    private List<Produto> produtos;

    //usando array
    public ListarProdutos() {
        produtos = new ArrayList<>();
    }
    //metodo de listagem
    public void listagemProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
