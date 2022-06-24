package test.java.assumptions.assumeNoException;

import main.java.livraria.exception.LivroNotFoundException;
import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;

import static org.junit.Assume.assumeNoException;

public class AssumeNoException {

    @Test
    public void assumeNoExceptionExemplo() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        livroService.adicionarLivro(livroRefatoracao);

        try {
            livroService.getLivroByTitulo("Refatoração: Aperfeiçoando o Design de Códigos Existentes");
        } catch (LivroNotFoundException e) {
            assumeNoException(e);
        }
    }

}
