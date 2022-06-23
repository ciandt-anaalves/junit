package test.java.annotations.before.beforeAll;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAllAnnotation {

    Livro livro;

    // equivalent to JUnit4's @BeforeClass:
    @BeforeAll
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
        assertNotNull(livro.getAutor());
        assertEquals("Stephen King", livro.getAutor());
    }
}
