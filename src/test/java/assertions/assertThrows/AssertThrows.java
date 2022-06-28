package test.java.assertions.assertThrows;


import main.java.livraria.exception.LivroNotFoundException;
import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrows {

    @Test
    public void assertThrowsLivroNotFoundException() {
        LivroService livroService = new LivroService();

        Livro livroCodigoLimpo = new Livro(1L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroCodigoLimpo);

        LivroNotFoundException exception = assertThrows(LivroNotFoundException.class, () -> {
            livroService.getLivroByTitulo("Teste");
        }, "Era esperado um LivroNotFoundException");

        assertEquals("Livro não encontrado na Livraria!", exception.getMessage());
    }

}
