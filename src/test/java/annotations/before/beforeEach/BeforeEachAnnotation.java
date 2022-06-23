package test.java.annotations.before.beforeEach;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BeforeEachAnnotation {

    Livro livro;

    // equivalent to JUnit4's @Before:
    @BeforeEach
    public void setUp() {
        livro = new Livro();
    }

    @Test
    public void shouldReturnBookAuthor() {
        livro.setAutor("Stephen King");
        assertEquals("Stephen King", livro.getAutor());
    }

    @Test
    public void shouldReturnNullIfThereIsNoAuthor() {
        assertNull(livro.getAutor());
    }
}
