package test.java.assertions.assertTimeout;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class assertTimeout {

    @Test
    public void assertTimeoutSemMensagem() {
        LivroService livroService = new LivroService();

        for (int i = 1; i <= 1000; i++) {
            livroService.adicionarLivro(new Livro((long) i, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler"));
        }

        List<String> actualTitulosLivros = new ArrayList<>();

        assertTimeout(Duration.ofMillis(1), () -> {
            actualTitulosLivros.addAll(livroService.getTitulosLivrosByEditora("Novatec Editora"));
        });

        assertEquals(1000, actualTitulosLivros.size());
    }

    @Test
    public void assertTimeoutComMensagem() {
        LivroService livroService = new LivroService();

        for (int i = 1; i <= 1000; i++) {
            livroService.adicionarLivro(new Livro((long) i, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler"));
        }

        List<String> actualTitulosLivros = new ArrayList<>();

        assertTimeout(Duration.ofMillis(1), () -> {
            actualTitulosLivros.addAll(livroService.getTitulosLivrosByEditora("Novatec Editora"));
        }, "Problemas de desempenho com o método getTitulosLivrosByEditora()!");

        assertEquals(1000, actualTitulosLivros.size());
    }

    @Test
    public void assertTimeoutComMensagemSupplier() {
        LivroService livroService = new LivroService();

        for (int i = 1; i <= 1000; i++) {
            livroService.adicionarLivro(new Livro((long) i, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler"));
        }

        List<String> actualTitulosLivros = new ArrayList<>();

        assertTimeout(Duration.ofMillis(1), () -> {
            actualTitulosLivros.addAll(livroService.getTitulosLivrosByEditora("Novatec Editora"));
        },  () -> "Problemas de desempenho com o método getTitulosLivrosByEditora()!");

        assertEquals(1000, actualTitulosLivros.size());
    }

}
