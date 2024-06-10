import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Biblioteca {
    private LinkedList<Livro> livros;

    public Biblioteca() {
        livros = new LinkedList<>();
    }

    public void inserir(Livro livro) {
        if (livros.contains(livro)) {
            System.out.println("Livro " + livro + " duplicado");
        } else {
            livros.add(livro);
        }
    }

    public Livro buscar(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public void remover(int id) {
        Livro livro = buscar(id);
        if (livro != null) {
            livros.remove(livro);
            System.out.println("Livro " + livro + " removido");
        } else {
            System.out.println("Livro com id " + id + " não encontrado");
        }
    }

    public void listarTodos() {
        Collections.sort(livros, (l1, l2) -> Integer.compare(l1.getId(), l2.getId()));
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
