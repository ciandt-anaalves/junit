package test.java.annotations.conditionals.disabledOn;

import main.java.livraria.model.Livro;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisabledOnAnnotation {

    Livro livro;

    @Test
    @DisplayName("Teste nao funciona em Linux")
    @DisabledOnOs({OS.LINUX})
    public void onlyRunsOnLinuxOS() {
        livro = new Livro();
        livro.setId(1L);

        assertEquals(1L, livro.getId());
    }

    @Test
    @DisabledOnJre(JRE.JAVA_18)
    void doesNotRunOnJava18() {
        livro = new Livro();
        livro.setId(1L);

        assertEquals(1L, livro.getId());
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_17)
    void notFromJava17toCurrentJavaFeatureNumber() {
        livro = new Livro();
        livro.setId(1L);

        assertEquals(1L, livro.getId());
    }

}
