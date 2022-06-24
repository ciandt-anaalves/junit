package test.java.assertions.fail;

import main.java.livraria.exception.LivroNotFoundException;
import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertFail {

    @Test
    public void assertFail() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

        livroService.adicionarLivro(livroRefatoracao);

        try {
            livroService.getLivroByTitulo("Teste");
            fail("A exceção esperada não foi lançada");
        } catch (final LivroNotFoundException e) {
            assertTrue(true);
        }
    }

}
