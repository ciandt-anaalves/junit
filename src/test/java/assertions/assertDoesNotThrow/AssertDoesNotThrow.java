package test.java.assertions.assertDoesNotThrow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AssertDoesNotThrow {
    @Test
    @DisplayName("Não deve lançar uma exceção")
    public void assertDoesNotThrowExemplo() {
        String mensagem = assertDoesNotThrow(() -> { return "Hello World!"; } );
        assertEquals("Hello World!", mensagem);
    }

}
