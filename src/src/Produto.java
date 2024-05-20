public class Produto extends Item {
    private double preco;
    private double porcentagemLucro;

    public Produto(String nome, double preco, double porcentagemLucro, int quantidade) {
        super(nome, quantidade);
        this.preco = preco;
        this.porcentagemLucro = porcentagemLucro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public double getPorcentagemLucro() {
        return porcentagemLucro;
    }

    public void setPorcentagemLucro(double porcentagemLucro) {
        if (porcentagemLucro < 0 || porcentagemLucro > 100) {
            throw new IllegalArgumentException("A porcentagem de lucro deve estar entre 0 e 100.");
        }
        this.porcentagemLucro = porcentagemLucro;
    }

    @Override
    public double calcularPrecoVenda() {
        return getPreco() + (getPreco() * getPorcentagemLucro() / 100);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Preço de Custo: R$%.2f | Porcentagem de Lucro: %.2f%% | Preço de Venda: R$%.2f | Quantidade: %d",
                getNome(), getPreco(), getPorcentagemLucro(), calcularPrecoVenda(), getQuantidade());
    }
}
