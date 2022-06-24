package test.java.assumptions.assumeFalse;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

public class AssumeFalse {

    // assumeFalse() -> Funciona apenas se o ambiente não for PROD
    @Test
    public void assumeFalseExemplo() {
        System.setProperty("ENV_SETUP", "DEV");

        LivroService livroService = new LivroService();

        assumeFalse("PROD".equals(System.getProperty("ENV_SETUP")), "AMBIENTE É PROD");

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

        livroService.adicionarLivro(livroRefatoracao);

        assertEquals(livroService.getLivroById(1L), livroRefatoracao);
    }

}
