package BibliotecaPCK;

public class Filme extends Publicacao{
    private final String diretor, atorPrincipal, sinopse;
    private final double duracao;

    public Filme(String titulo, String autor, int anoPublicacao, String genero, String editora, int qtdDisponivel, String diretor, String atorPrincipal, String sinopse, double duracao) {
        super(titulo, autor, anoPublicacao, genero, editora, qtdDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }

    public void imprimirDadosPublicacao() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + anoPublicacao);
        System.out.println("Gênero: " + genero);
        System.out.println("Editora: " + editora);
        System.out.println("Quantidade disponível: " + qtdDisponivel);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ator Principal: " + atorPrincipal);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Duração: " + duracao);
    }
}
