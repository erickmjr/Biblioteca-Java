package BibliotecaPCK;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class ProgramaBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Publicacao> publicacoes = new ArrayList<>();
        int contadorLivros = 1;
        int contadorFilmes = 1;
        int op;

        do {
            System.out.println("Digite o valor correspondente à uma das opções abaixo: ");
            System.out.println("1)Cadastrar Livro");
            System.out.println("2)Cadastrar Filme");
            System.out.println("3)Listar publicações");
            System.out.println("4)Sair");
            System.out.println("R: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Digite o título do livro " + contadorLivros + ": ");
                    String tituloLivro = sc.nextLine();

                    System.out.println("Digite o nome do autor do livro " + contadorLivros + ": ");
                    String autorLivro = sc.nextLine();


                    System.out.println("Digite o gênero do livro " + contadorLivros + ": ");
                    String generoLivro = sc.next();

                    System.out.println("Ano de publicação " + contadorLivros + ": ");
                    int anoPublicacaoLivro = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a quantidade disponível do livro " + contadorLivros + ": ");
                    int qtdDisponivelLivro = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome da editora do  livro " + contadorLivros + ": ");
                    String editoraLivro = sc.nextLine();

                    System.out.println("Digite a edição do livro " + contadorLivros + ": ");
                    String edicaoLivro = sc.nextLine();

                    System.out.println("Digite o ISBN do livro " + contadorLivros + ": ");
                    String isbn = sc.nextLine();

                    publicacoes.add(new Livro(tituloLivro, autorLivro, anoPublicacaoLivro, generoLivro, editoraLivro, qtdDisponivelLivro, edicaoLivro, isbn));
                    contadorLivros++;
                    break;


                case 2:
                    System.out.println("Digite o título do filme " + contadorFilmes + ": ");
                    String tituloFilme = sc.nextLine();

                    System.out.println("Digite o nome do autor do filme " + contadorFilmes + ": ");
                    String autorFilme = sc.nextLine();


                    System.out.println("Digite o gênero do filme " + contadorFilmes + ": ");
                    String generoFilme = sc.next();

                    System.out.println("Ano de publicação " + contadorFilmes + ": ");
                    int anoPublicacaoFilme = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a quantidade disponível do filme " + contadorFilmes + ": ");
                    int qtdDisponivelFilme = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome da editora do  filme " + contadorFilmes + ": ");
                    String editoraFilme = sc.nextLine();

                    System.out.println("Digite o nome do(a) diretor(a) do filme " + contadorFilmes + ": ");
                    String diretorFilme = sc.nextLine();

                    System.out.println("Digite o Ator principal do filme " + contadorFilmes + ": ");
                    String atorPrincipal = sc.nextLine();

                    System.out.println("Digite a sinopse do filme " + contadorFilmes + ": ");
                    String sinopseFilme = sc.nextLine();

                    System.out.println("Digite a duração do filme (min) " + contadorFilmes + ": ");
                    double duracaoFilme = sc.nextDouble();
                    sc.nextLine();

                    publicacoes.add(new Filme(tituloFilme, autorFilme, anoPublicacaoFilme, generoFilme, editoraFilme, qtdDisponivelFilme, diretorFilme, atorPrincipal, sinopseFilme, duracaoFilme));
                    contadorFilmes++;
                    break;

                case 3:
                    for (Publicacao publicacao : publicacoes) {
                        System.out.println("<<<<< Dados da publicação >>>>>");
                        publicacao.imprimirDadosPublicacao();
                        System.out.println("\n");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op != 4);
    }
}


/*
*           Resposta d. Item V:
*                   Foi possível adicionar um objeto do tipo Filme e um objeto do tipo Livro na lista de publicações, pois existe uma relação de herança entre as classes "Publicação", "Filme" e "Livro".
*
*           Resposta d. Item VI:
*                   Foi possível, pois como se trata de um método abstrato na classe "Publicação", o método teve de ser implementado novamente nas classes "Livro" e "Filme" para atender às especificidades de cada classe, tornando possível a impressão durante a execução do loop.
*
*
*
* */