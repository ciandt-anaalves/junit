package test.java.assertions.assertArrayEquals;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AssertArraysEquals {

    @Test
    public void assertArrayEqualsSemMensagem() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        Livro livroCodigoLimpo = new Livro(2L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");
        Livro livroProgramadorPragmatico = new Livro(3L, "O Programador Pragmático: De Aprendiz a Mestre", "Bookman", "Andrew Hunt");
        Livro livroArquiteturaLimpa = new Livro(4L, "Arquitetura limpa: O guia do artesão para estrutura e design de software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroRefatoracao);
        livroService.adicionarLivro(livroCodigoLimpo);
        livroService.adicionarLivro(livroProgramadorPragmatico);
        livroService.adicionarLivro(livroArquiteturaLimpa);

        Long[] actualIdsLivros = livroService.getIdsLivrosByEditora("Alta Books");

        assertArrayEquals(new Long[] {2L, 4L}, actualIdsLivros);
    }

    @Test
    public void assertArrayEqualsComMensagem() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        Livro livroCodigoLimpo = new Livro(2L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");
        Livro livroProgramadorPragmatico = new Livro(3L, "O Programador Pragmático: De Aprendiz a Mestre", "Bookman", "Andrew Hunt");
        Livro livroArquiteturaLimpa = new Livro(4L, "Arquitetura limpa: O guia do artesão para estrutura e design de software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroRefatoracao);
        livroService.adicionarLivro(livroCodigoLimpo);
        livroService.adicionarLivro(livroProgramadorPragmatico);
        livroService.adicionarLivro(livroArquiteturaLimpa);

        Long[] actualIdsLivros = livroService.getIdsLivrosByEditora("Alta Books");

        assertArrayEquals(new Long[] {2L, 4L}, actualIdsLivros, "Ids Livros não são Iguais!");
    }

    @Test
    public void assertArrayEqualsComMensagemSupplier() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");
        Livro livroCodigoLimpo = new Livro(2L, "Código limpo: Habilidades práticas do Agile Software", "Alta Books", "Robert C. Martin");
        Livro livroProgramadorPragmatico = new Livro(3L, "O Programador Pragmático: De Aprendiz a Mestre", "Bookman", "Andrew Hunt");
        Livro livroArquiteturaLimpa = new Livro(4L, "Arquitetura limpa: O guia do artesão para estrutura e design de software", "Alta Books", "Robert C. Martin");

        livroService.adicionarLivro(livroRefatoracao);
        livroService.adicionarLivro(livroCodigoLimpo);
        livroService.adicionarLivro(livroProgramadorPragmatico);
        livroService.adicionarLivro(livroArquiteturaLimpa);

        Long[] actualIdsLivros = livroService.getIdsLivrosByEditora("Alta Books");

        assertArrayEquals(new Long[] {2L, 4L}, actualIdsLivros, () -> "Ids Livros não são Iguais!");
    }

}
