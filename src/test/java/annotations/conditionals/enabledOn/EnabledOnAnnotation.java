package test.java.annotations.conditionals.enabledOn;

import main.java.livraria.model.Livro;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnabledOnAnnotation {

    Livro livro;

    @Test
    @DisplayName("Teste para Linux")
    @EnabledOnOs({OS.LINUX})
    public void onlyRunsOnLinuxOS() {
        livro = new Livro();
        livro.setId(1L);

        assertEquals(1L, livro.getId());
    }

    @Test
    @DisplayName("Teste para Windows e Mac")
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    public void onlyRunsOnWindowsOrMacOS() {
        livro = new Livro();
        livro.setId(1L);

        assertEquals(1L, livro.getId());
    }

    @Test
    @EnabledOnJre({ JRE.JAVA_18 })
    void onJava18() {
        livro = new Livro();
        livro.setId(1L);

        assertEquals(1L, livro.getId());
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_17)
    void fromJava8ToJava17() {
        livro = new Livro();
        livro.setId(1L);

        assertEquals(1L, livro.getId());
    }
}
