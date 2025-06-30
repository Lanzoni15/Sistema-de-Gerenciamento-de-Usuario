import java.util.ArrayList;
import java.util.List;

public class SistemaItau {
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void listarAcessos() {
        for (Usuario u : usuarios) {
            u.acessarSistema();
        }
    }
}
