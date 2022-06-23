package test.java.assertions.assertIterableEquals;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.List;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;

public class assertIterableEquals {

    @Test
    public void assertIterableEqualsSemMensagem() {
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

        assertIterableEquals(expectedTitulosLivros, actualTitulosLivros);
    }

    @Test
    public void assertIterableEqualsComMensagem() {
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

        assertIterableEquals(expectedTitulosLivros, actualTitulosLivros, "Titulos não são iguais!");
    }

    @Test
    public void assertIterableEqualsComMensagemSupplier() {
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

        assertIterableEquals(expectedTitulosLivros, actualTitulosLivros, "Titulos não são iguais!");
    }

}
