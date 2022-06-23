package test.java.assertions.assertAll;



import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAll {

    @Test
    public void assertAllSemHeading() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        Livro livroCodigoLimpo = new Livro(2L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");
        Livro livroProgramadorPragmatico = new Livro(3L, "O Programador Pragmático: De Aprendiz a Mestre", "Bookman", "Andrew Hunt");
        Livro livroArquiteturaLimpa = new Livro(4L, "Arquitetura limpa: O guia do artesão para estrutura e design de software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroRefatoracao);
        livroService.adicionarLivro(livroCodigoLimpo);
        livroService.adicionarLivro(livroProgramadorPragmatico);
        livroService.adicionarLivro(livroArquiteturaLimpa);

        Livro actualLivro = livroService.getLivroById(1L);

        assertAll(
                () -> assertEquals(1L, actualLivro.getId()),
                () -> assertEquals("Refatoração: Aperfeiçoando o Design de Códigos Existentes", actualLivro.getTitulo()),
                () -> assertEquals("Martin Fowler", actualLivro.getAutor())
        );
    }

    @Test
    public void assertAllComHeading() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        Livro livroCodigoLimpo = new Livro(2L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");
        Livro livroProgramadorPragmatico = new Livro(3L, "O Programador Pragmático: De Aprendiz a Mestre", "Bookman", "Andrew Hunt");
        Livro livroArquiteturaLimpa = new Livro(4L, "Arquitetura limpa: O guia do artesão para estrutura e design de software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroRefatoracao);
        livroService.adicionarLivro(livroCodigoLimpo);
        livroService.adicionarLivro(livroProgramadorPragmatico);
        livroService.adicionarLivro(livroArquiteturaLimpa);

        Livro actualLivro = livroService.getLivroById(1L);

        assertAll("Deve devolver um livro",
                () -> assertEquals(1L, actualLivro.getId()),
                () -> assertEquals("Refatoração: Aperfeiçoando o Design de Códigos Existentes", actualLivro.getTitulo()),
                () -> assertEquals("Martin Fowler", actualLivro.getAutor())
        );
    }


}
