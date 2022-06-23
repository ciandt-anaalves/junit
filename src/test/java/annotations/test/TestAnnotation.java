package test.java.annotations.test;

import main.java.livraria.model.Livro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAnnotation {

    @Test
    public void shouldReturnCorrectAuthorName() {
        Livro livro = new Livro();
        livro.setAutor("Andre Aciman");

        assertEquals("Andre Aciman", livro.getAutor());
    }
}
