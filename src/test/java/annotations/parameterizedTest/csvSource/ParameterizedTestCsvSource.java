package test.java.annotations.parameterizedTest.csvSource;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParameterizedTestCsvSource {

    Livro livroUm;
    Livro livroDois;
    LivroService livroService;

    @BeforeEach
    public void setUp(){
        livroUm = new Livro();
        livroDois = new Livro();

        livroUm.setId(1L);
        livroUm.setAutor("Andre Aciman");
        livroDois.setId(2L);
        livroDois.setAutor("Clarice Lispector");

        livroService = new LivroService();
        livroService.adicionarLivro(livroUm);
        livroService.adicionarLivro(livroDois);
    }

    @ParameterizedTest(name = "Livro de id {0} e autor {1} encontrado")
    @CsvSource(value = {"1|Andre Aciman", "2|Clarice Lispector"}, delimiter = '|')
    public void shouldReturnBooksByTheirIds(long id, String autorLivro) {
        assertEquals(autorLivro,
                livroService.getLivroById(id).getAutor());
    }
}
