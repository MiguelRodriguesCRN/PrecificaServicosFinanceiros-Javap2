import javax.swing.JOptionPane;

public class CadastroDeProduto {

    private ListarProdutos listarProdutos;

    public CadastroDeProduto(ListarProdutos listarProdutos) {
        this.listarProdutos = listarProdutos;
    }

    public void cadastrarNovoProduto() {
        try {
            String nome = JOptionPane.showInputDialog("Por favor, inserir o nome do novo produto:");
            double preco = Double.parseDouble(JOptionPane.showInputDialog("Por favor, inserir o preço do novo produto (use vírgula para decimais):"));
            double porcentagemLucro = Double.parseDouble(JOptionPane.showInputDialog("Por favor, inserir a porcentagem de lucro desejada:"));
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Por favor, inserir a quantidade na caixa comprada:"));

            Produto produto = new Produto(nome, preco, porcentagemLucro, quantidade);
            listarProdutos.cadastrarProduto(produto);

            JOptionPane.showMessageDialog(null, "Cadastro finalizado, o novo produto foi adicionado ao inventário");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira números válidos para preço, porcentagem de lucro e quantidade.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void alterarProduto() {
        String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto que deseja alterar:");
        Produto produto = listarProdutos.pesquisarProduto(nomeProduto);

        if (produto != null) {
            try {
                double novoPreco = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo preço do produto (use vírgula para decimais):"));
                double novaPorcentagemLucro = Double.parseDouble(JOptionPane.showInputDialog("Digite a nova porcentagem de lucro desejada:"));
                int novaQuantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade na caixa comprada:"));

                produto.setPreco(novoPreco);
                produto.setPorcentagemLucro(novaPorcentagemLucro);
                produto.setQuantidade(novaQuantidade);

                JOptionPane.showMessageDialog(null, "Produto alterado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void encerrar() {
        JOptionPane.showMessageDialog(null, "Programa encerrado.", "Encerrando...", JOptionPane.INFORMATION_MESSAGE);
    }
}
