package test.java.annotations.repeatedTest;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RepeatedTestAnnotation {

    Livro livro;
    long incrementId = 1;
    LivroService livroService;

    @BeforeAll
    public void setUpAll() {
        livroService = new LivroService();
    }

    @BeforeEach
    public void setUp() {
        livro = new Livro();
    }

    @RepeatedTest(5)
    @DisplayName("Deve adicionar 5 livros na lista")
    public void shouldAddFiveDifferentBooksOnTheList() {
        livro.setId(incrementId++);
        livroService.adicionarLivro(livro);

        assertEquals(livro, livroService.getLivroById(livro.getId()));
    }

    @AfterAll
    public void allBooksAdded() {
        for (Livro livro : livroService.getListaDeLivros()) {
            System.out.println("Livro de id " + livro.getId() + " adicionado.");
        }
    }
}
