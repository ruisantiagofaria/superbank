public class usuario {

    private String usuario;
    private String senha;

    public usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    // G & S
    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}