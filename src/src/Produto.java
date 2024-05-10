//criando a classe produto
public class Produto {
    //declarando variáveis de nome e preço
    private String nome;
    private double preco;

    //Get
    public Produto( String nome, double preco) {

        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return  " Nome: " + nome + ", Preço: R$" + preco;
    }
}


