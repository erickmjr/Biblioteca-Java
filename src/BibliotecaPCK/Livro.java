package BibliotecaPCK;

public class Livro extends Publicacao {

    private String edicao, isbn;

    public Livro(String titulo, String autor, int anoPublicacao, String genero, String editora, int qtdDisponivel, String edicao, String isbn) {
        super(titulo, autor, anoPublicacao, genero, editora, qtdDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public void imprimirDadosPublicacao() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
        System.out.println("Gênero: " + genero);
        System.out.println("Editora: " + editora);
        System.out.println("Quantidade disponível: " + qtdDisponivel);
        System.out.println("Edição: " + edicao);
        System.out.println("ISBN: " + isbn);
    }
}
