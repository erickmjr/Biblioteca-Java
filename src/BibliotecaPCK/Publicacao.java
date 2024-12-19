package BibliotecaPCK;

public class Publicacao {
    protected String titulo, autor, genero, editora;
    protected int anoPublicacao, qtdDisponivel;

    public Publicacao (String titulo, String autor, int anoPublicacao, String genero, String editora, int qtdDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.qtdDisponivel = qtdDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditora() {
        return editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void imprimirDadosPublicacao(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
        System.out.println("Editora: " + editora);
        System.out.println("Ano de publicaçao: " + anoPublicacao);
        System.out.println("Quantidade disponível: " + qtdDisponivel);
    }

}
