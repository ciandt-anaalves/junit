package test.java.assumptions.assumeThat;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assume.assumeThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssumeThat {

    @Test
    public void assumeThatIs() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

        livroService.adicionarLivro(livroRefatoracao);

        Livro actualLivro = livroService.getLivroById(1L);

        assumeThat(1L, is(actualLivro.getId()));

        assertEquals(livroService.getLivroByTitulo("Refatoração: Aperfeiçoando o Design de Códigos Existentes"), livroRefatoracao);
    }

}
