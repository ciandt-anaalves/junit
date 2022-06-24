package test.java.assertions.assertThrows;


import main.java.livraria.exception.LivroNotFoundException;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrows {

    @Test
    public void assertThrowsLivroNotFoundException() {
        LivroService livroService = new LivroService();

        LivroNotFoundException exception = assertThrows(LivroNotFoundException.class, () -> {
            livroService.getLivroByTitulo("Teste");
        });

        assertEquals("Livro não encontrado na Livraria!", exception.getMessage());
    }

}
