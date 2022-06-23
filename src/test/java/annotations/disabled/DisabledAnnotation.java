package test.java.annotations.disabled;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisabledAnnotation {

    @Test
    @Disabled("Teste desabilitado ate implementar o metodo na LivroService")
    public void testGetLivroByAutor() {
        Livro livroUm = new Livro();
        Livro livroDois = new Livro();

        livroUm.setAutor("Andre Aciman");
        livroUm.setTitulo("Call me by your name");
        livroDois.setAutor("Clarice Lispector");

        LivroService livroService = new LivroService();
        livroService.adicionarLivro(livroUm);
        livroService.adicionarLivro(livroDois);

        assertEquals(livroUm, livroService.getLivroByAutor("Andre Aciman"));
    }

    @Test
    public void testGetLivroById() {
        Livro livroUm = new Livro();
        Livro livroDois = new Livro();

        livroUm.setId(1L);
        livroDois.setId(2L);

        LivroService livroService = new LivroService();
        livroService.adicionarLivro(livroUm);
        livroService.adicionarLivro(livroDois);

        assertEquals(livroUm, livroService.getLivroById(1L));
    }
}
