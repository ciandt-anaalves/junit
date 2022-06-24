package test.java.assumptions.assumeNotNull;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;

import static org.junit.Assume.assumeNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssumeNotNull {

    @Test
    public void assumeNotNullExemplo() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

        assumeNotNull(livroService);

        livroService.adicionarLivro(livroRefatoracao);

        assertEquals(livroService.getLivroById(1L), livroRefatoracao);
    }

}
