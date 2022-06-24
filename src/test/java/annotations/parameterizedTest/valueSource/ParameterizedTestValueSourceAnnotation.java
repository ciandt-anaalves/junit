package test.java.annotations.parameterizedTest.valueSource;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParameterizedTestValueSourceAnnotation {

    Livro livroUm;
    Livro livroDois;
    LivroService livroService;

    @BeforeEach
    public void setUp(){
        livroUm = new Livro();
        livroDois = new Livro();

        livroUm.setId(1L);
        livroDois.setId(2L);

        livroService = new LivroService();
        livroService.adicionarLivro(livroUm);
        livroService.adicionarLivro(livroDois);
    }

    @ParameterizedTest(name = "Livro de id {0} existe na lista")
    @ValueSource(longs = {1L, 2L})
    public void shouldReturnBooksByTheirIds(Long id) {
        assertNotNull(livroService.getLivroById(id));
    }
}
