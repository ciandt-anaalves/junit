package test.java.assertions.assertEquals;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertEquals {

    @Test
    public void assertEqualsSemMensagem() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        Livro livroCodigoLimpo = new Livro(2L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroRefatoracao);
        livroService.adicionarLivro(livroCodigoLimpo);

        Livro actualLivro = livroService.getLivroById(1L);

        assertEquals(1L, actualLivro.getId());
        assertEquals("Refatoração: Aperfeiçoando o Design de Códigos Existentes", actualLivro.getTitulo());
        assertEquals("Martin Fowler", actualLivro.getAutor());
    }

    @Test
    public void assertEqualsComMensagem() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        Livro livroCodigoLimpo = new Livro(2L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroRefatoracao);
        livroService.adicionarLivro(livroCodigoLimpo);

        Livro actualLivro = livroService.getLivroById(1L);

        assertEquals("Refatoração: Aperfeiçoando o Design de Códigos Existentes", actualLivro.getTitulo(), "Titulo do livro não é igual!");
        assertEquals(1L, actualLivro.getId(), "Id do livro não é igual!");
        assertEquals("Martin Fowler", actualLivro.getAutor(), "Autor do livro não é igual!");
    }

    @Test
    public void assertEqualsComMensagemSupplier() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        Livro livroCodigoLimpo = new Livro(2L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroRefatoracao);
        livroService.adicionarLivro(livroCodigoLimpo);

        Livro actualLivro = livroService.getLivroById(1L);

        assertEquals(1L, actualLivro.getId());
        assertEquals("Refatoração: Aperfeiçoando o Design de Códigos Existentes", actualLivro.getTitulo(), () -> "Titulo do livro não é igual!");
        assertEquals("Martin Fowler", actualLivro.getAutor(), () -> "Autor do livro não é igual!");
    }

}
