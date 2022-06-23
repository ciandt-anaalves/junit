package test.java.annotations.displayName;

import main.java.livraria.model.Livro;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisplayNameAnnotation {

    @Test
    @DisplayName("Deve retornar a editora do livro")
    public void shouldReturnBookEditor() {
        Livro livro = new Livro();
        livro.setEditora("Intrinseca");

        assertEquals("Intrinseca", livro.getEditora());
    }

}
