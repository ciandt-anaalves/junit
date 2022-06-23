package test.java.assertions.assertThat;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AssertThat {

    @Test
    public void assertThatIs() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        Livro livroCodigoLimpo = new Livro(2L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroRefatoracao);
        livroService.adicionarLivro(livroCodigoLimpo);

        Livro actualLivro = livroService.getLivroById(1L);

        assertThat(1L, is(actualLivro.getId()));
    }

    @Test
    public void assertThatNotIs() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        Livro livroCodigoLimpo = new Livro(2L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroRefatoracao);
        livroService.adicionarLivro(livroCodigoLimpo);

        Livro actualLivro = livroService.getLivroById(1L);

        assertThat(2L, is(not(actualLivro.getId())));
    }

    @Test
    public void assertThatHasItems() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        Livro livroCodigoLimpo = new Livro(2L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");
        Livro livroProgramadorPragmatico = new Livro(3L, "O Programador Pragmático: De Aprendiz a Mestre", "Bookman", "Andrew Hunt");
        Livro livroArquiteturaLimpa = new Livro(4L, "Arquitetura limpa: O guia do artesão para estrutura e design de software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroRefatoracao);
        livroService.adicionarLivro(livroCodigoLimpo);
        livroService.adicionarLivro(livroProgramadorPragmatico);
        livroService.adicionarLivro(livroArquiteturaLimpa);

        List<Long> list = List.of(livroService.getIdsLivrosByEditora("Alta Books"));

        assertThat(list, hasItems(2L, 4L));
    }

}
