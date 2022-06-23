package test.java.assertions.assertLinesMatch;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class AssertLinesMatch {

    @Test
    public void assertLinesMatchExemplo() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        Livro livroCodigoLimpo = new Livro(2L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");
        Livro livroProgramadorPragmatico = new Livro(3L, "O Programador Pragmático: De Aprendiz a Mestre", "Bookman", "Andrew Hunt");
        Livro livroArquiteturaLimpa = new Livro(4L, "Arquitetura limpa: O guia do artesão para estrutura e design de software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroRefatoracao);
        livroService.adicionarLivro(livroCodigoLimpo);
        livroService.adicionarLivro(livroProgramadorPragmatico);
        livroService.adicionarLivro(livroArquiteturaLimpa);

        List<String> actualTitulosLivros = livroService.getTitulosLivrosByEditora("Alta Books");

        List<String> expectedTitulosLivros = new ArrayList<>();
        expectedTitulosLivros.add("Código limpo: Habilidades práticas do Agile Software");
        expectedTitulosLivros.add("Arquitetura limpa: O guia do artesão para estrutura e design de software");

        assertLinesMatch(expectedTitulosLivros, actualTitulosLivros);
    }

}
