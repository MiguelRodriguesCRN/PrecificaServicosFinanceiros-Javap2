import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        ListarProdutos listagemProdutos = new ListarProdutos();
        List<Produto> listaDeProdutos = listagemProdutos.getProdutos();
        DeletarProdutos deletarProdutos = new DeletarProdutos(listaDeProdutos);
        CadastroDeProduto cadastrarNovoProduto = new CadastroDeProduto(listagemProdutos);
        int opcao;

        boolean executando = true;
        boolean logado = false;

        while (executando) {
            if (!logado) {
                String[] loginOptions = {"Cadastrar", "Login", "Sair"};
                int loginUsuario = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Login",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, loginOptions, loginOptions[0]);

                switch (loginUsuario) {
                    case 0:
                        String novoUsuario = JOptionPane.showInputDialog("Digite o nome do usuário:");
                        String novaSenha = JOptionPane.showInputDialog("Digite a senha:");
                        login.cadastrarUsuario(novoUsuario, novaSenha);
                        break;
                    case 1:
                        String username = JOptionPane.showInputDialog("Digite seu nome de usuário:");
                        String senha = JOptionPane.showInputDialog("Digite a senha:");
                        if (login.autenticar(username, senha)) {
                            JOptionPane.showMessageDialog(null, "Login bem sucedido!");
                            logado = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Nome de usuário ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case 2:
                        executando = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                do {
                    String[] menuOptions = {"Cadastrar Produto", "Listar Produtos", "Pesquisar Produto",
                            "Alterar Produto", "Deletar Produto", "Sair"};
                    opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menuOptions, menuOptions[0]);

                    switch (opcao) {
                        case 0:
                            cadastrarNovoProduto.cadastrarNovoProduto();
                            break;
                        case 1:
                            listagemProdutos.listagemProdutos();
                            break;
                        case 2:
                            String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
                            Produto produtoEncontradoNome = listagemProdutos.pesquisarProduto(nomeProduto);
                            if (produtoEncontradoNome != null) {
                                JOptionPane.showMessageDialog(null, "Produto encontrado:\n " + produtoEncontradoNome);
                            } else {
                                JOptionPane.showMessageDialog(null, "Produto não encontrado.", "Erro", JOptionPane.WARNING_MESSAGE);
                            }
                            break;
                        case 3:
                            cadastrarNovoProduto.alterarProduto();
                            break;
                        case 4:
                            String nomeDeletarProduto = JOptionPane.showInputDialog("Digite o nome do produto a ser deletado:");
                            deletarProdutos.deletarProdutoPorNome(nomeDeletarProduto);
                            break;
                        case 5:
                            logado = false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } while (opcao != 5);
            }
        }
        scanner.close();
    }
}
