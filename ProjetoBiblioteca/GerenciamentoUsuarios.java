import java.util.LinkedList;
import java.util.Collections;

public class GerenciamentoUsuarios {
    private LinkedList<Usuario> listaUsuarios;

    public GerenciamentoUsuarios() {
        listaUsuarios = new LinkedList<>();
    }

    public void inserir(Usuario usuario) {
        if (listaUsuarios.contains(usuario)) {
            System.out.println("Usuário " + usuario + " duplicado");
        } else {
            listaUsuarios.add(usuario);
        }
    }

    public Usuario buscar(int id) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public void remover(int id) {
        Usuario usuario = buscar(id);
        if (usuario != null) {
            listaUsuarios.remove(usuario);
            System.out.println("Usuário " + usuario + " removido");
        } else {
            System.out.println("Usuário com id " + id + " não encontrado");
        }
    }

    public void listarTodos() {
        Collections.sort(listaUsuarios, (u1, u2) -> Integer.compare(u1.getId(), u2.getId()));
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }
    }
}
