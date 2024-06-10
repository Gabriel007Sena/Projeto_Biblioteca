public class Main {
    public static void main(String[] args) {
        // Teste de inserção, busca, remoção e listagem de livros
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Calculo 1", "Autor A", 2000);
        Livro livro2 = new Livro("Estrutura de Dados", "Autor B", 2001);
        Livro livro3 = new Livro("Banco de Dados", "Autor C", 2002);

        biblioteca.inserir(livro1);
        biblioteca.inserir(livro2);
        biblioteca.inserir(livro2);  // Tentativa de inserir duplicado
        biblioteca.inserir(livro3);

        System.out.println("Listagem de todos os livros:");
        biblioteca.listarTodos();

        System.out.println("\nBuscando livro com ID 2:");
        System.out.println(biblioteca.buscar(2));

        System.out.println("\nRemovendo livro com ID 2:");
        biblioteca.remover(2);

        System.out.println("\nListagem de todos os livros após remoção:");
        biblioteca.listarTodos();

        // Teste de inserção, busca, remoção e listagem de usuários
        GerenciamentoUsuarios gerUsuarios = new GerenciamentoUsuarios();
        Usuario usuario1 = new Usuario("João", "joao@example.com");
        Usuario usuario2 = new Usuario("Maria", "maria@example.com");

        gerUsuarios.inserir(usuario1);
        gerUsuarios.inserir(usuario2);
        gerUsuarios.inserir(usuario2);  // Tentativa de inserir duplicado

        System.out.println("\nListagem de todos os usuários:");
        gerUsuarios.listarTodos();

        System.out.println("\nBuscando usuário com ID 1:");
        System.out.println(gerUsuarios.buscar(1));

        System.out.println("\nRemovendo usuário com ID 1:");
        gerUsuarios.remover(1);

        System.out.println("\nListagem de todos os usuários após remoção:");
        gerUsuarios.listarTodos();
    }
}
