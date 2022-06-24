package test.java.assertions.assertInstanceOf;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
public class AssertInstanceOf {

    @Test
    public void assertInstanceOfLivro() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

        livroService.adicionarLivro(livroRefatoracao);

        Livro actualLivro = livroService.getLivroById(1L);

        assertInstanceOf(Livro.class, actualLivro, "Objeto não é do tipo da classe");
    }

}
