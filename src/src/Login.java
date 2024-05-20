import java.util.ArrayList;
import java.util.List;

public class Login {
    private List<Usuario> usuarios;

    public Login() {
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(String username, String senha) {
        usuarios.add(new Usuario(username, senha));
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public boolean autenticar(String username, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getUsername().equals(username) && usuario.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
}