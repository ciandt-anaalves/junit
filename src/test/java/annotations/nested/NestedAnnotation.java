package test.java.annotations.nested;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NestedAnnotation {

    Livro livroUm;
    Livro livroDois;

    LivroService livroService;

    long id = 1L;
    String autor = "Andre Aciman";
    String titulo = "Call me by your name";
    String editora = "Intrinseca";

    long idDois = 2L;
    String autorDois = "Stephen King";
    String tituloDois = "Misery";
    String editoraDois = "Intrinseca";

    @BeforeAll
    public void setUp() {
        livroUm = new Livro();
        livroDois = new Livro();

        livroService = new LivroService();

        livroUm.setId(id);
        livroUm.setAutor(autor);
        livroUm.setTitulo(titulo);
        livroUm.setEditora(editora);

        livroDois.setId(idDois);
        livroDois.setAutor(autorDois);
        livroDois.setTitulo(tituloDois);
        livroDois.setEditora(editoraDois);

        livroService.adicionarLivro(livroUm);
        livroService.adicionarLivro(livroDois);
    }

    @Nested
    @DisplayName("Testes para os Getters e Setters")
    class LivroGettersAndSetters {

        @Test
        @DisplayName("Deve retornar o id")
        public void shouldReturnBookId() {
            assertEquals(id, livroUm.getId());
        }

        @Test
        @DisplayName("Deve retornar o autor")
        public void shouldReturnBookAuthor() {
            assertEquals(autor, livroUm.getAutor());
        }

        @Test
        @DisplayName("Deve retornar o titulo")
        public void shouldReturnBookTitle() {
            assertEquals(titulo, livroUm.getTitulo());
        }

        @Test
        @DisplayName("Deve retornar a editora")
        public void shouldReturnBookEditora() {
            assertEquals(editora, livroUm.getEditora());
        }
    }

    @Nested
    @DisplayName("Testes para os metodos da LivroService - getLivros")
    class LivroServiceMethodsGetLivros {

        @Test
        @DisplayName("Testar o metodo getListaDeLivros")
        public void shouldReturnAllBooksAdded() {
            assertEquals(livroUm, livroService.getListaDeLivros().get(0));
            assertEquals(livroDois, livroService.getListaDeLivros().get(1));
        }

        @Test
        @DisplayName("Testar o metodo getLivroById")
        public void shouldReturnBookById() {
            assertEquals(livroUm, livroService.getLivroById(1L));
            assertEquals(livroDois, livroService.getLivroById(2L));
        }

        @Test
        @DisplayName("Testar o metodo getLivroByTitulo")
        public void shouldReturnBookByTitle() {
            assertEquals(livroUm, livroService.getLivroByTitulo(titulo));
            assertEquals(livroDois, livroService.getLivroByTitulo(tituloDois));
        }
    }
}
