package test.java.annotations.after;

import main.java.livraria.model.Livro;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AfterAnnotations {

    Livro livro;

    @BeforeAll
    public void setUp() {
        livro = new Livro();
    }

    @Test
    public void shouldReturnBookId() {
        livro.setId(1L);
        assertEquals(1L, livro.getId());
    }

    @Test
    public void shouldReturnBookAuthor() {
        livro.setAutor("Andre Aciman");
        assertEquals("Andre Aciman", livro.getAutor());
    }

    @Test
    public void shouldReturnBookEditor() {
        livro.setEditora("Intrinseca");
        assertEquals("Intrinseca", livro.getEditora());
    }

    @AfterEach
    public void cleanUpEach() {
        System.out.println("-> Teste finalizado com sucesso");
    }

    @AfterAll
    public void cleanUpAll() {
        System.out.println("--- Todos os testes passaram! ---");
    }
}
