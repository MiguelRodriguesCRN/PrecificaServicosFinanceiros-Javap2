public class Usuario {
    private String username;
    private String senha;

    // Construtor username e senha
    public Usuario(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    // Get Ssername e get Senha
    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }
}
