package test.java.assumptions.assumingThat;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class AssumingThat {

    @Test
    public void assumingThatExemplo() {
        System.setProperty("ENV_SETUP", "TEST");

        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        livroService.adicionarLivro(livroRefatoracao);

        assumingThat("DEV".equals(System.getProperty("ENV_SETUP")),
                () -> {
                    assertEquals(livroService.getLivroById(1L), livroRefatoracao);
                });

        assertEquals(livroService.getLivroByTitulo("Refatoração: Aperfeiçoando o Design de Códigos Existentes"), livroRefatoracao);
    }

}
