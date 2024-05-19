public class Produto {

    private String nome;
    private double preco;
    private double porcentagemLucro;
    private int quantidade;

    public Produto(String nome, double preco, double porcentagemLucro, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.porcentagemLucro = porcentagemLucro;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPorcentagemLucro() {
        return porcentagemLucro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s| Preço: %.2f| Porcentagem de Lucro: %.2f%%| Quantidade: %d",
                nome, preco, porcentagemLucro, quantidade);
    }
}
