package test.java.assertions.assertTrue;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;

import java.util.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class assertTrue {

    @Test
    public void assertTrueWithSemMensagem() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

//		livroService.adicionarLivro(livroRefatoracao);

        List<Livro> listaDeLivros = livroService.getListaDeLivros();

        assertTrue(listaDeLivros.isEmpty());
    }

    @Test
    public void assertTrueSemMensagemBooleanSupplier() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

//		livroService.adicionarLivro(livroRefatoracao);

        List<Livro> listaDeLivros = livroService.getListaDeLivros();

        assertTrue(() -> listaDeLivros.isEmpty());
    }

    @Test
    public void assertTrueComMensagem() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

//		livroService.adicionarLivro(livroRefatoracao);

        List<Livro> listaDeLivros = livroService.getListaDeLivros();

        assertTrue(listaDeLivros.isEmpty(), "Lista de Livros não está vazia!");
    }

    @Test
    public void assertTrueBooleanSupplierComMensagem() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

//		livroService.adicionarLivro(livroRefatoracao);

        List<Livro> listaDeLivros = livroService.getListaDeLivros();

        assertTrue(() -> listaDeLivros.isEmpty(), "Lista de Livros não está vazia!");
    }

    @Test
    public void assertTrueComMensagemSupplier() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

//		livroService.adicionarLivro(livroRefatoracao);

        List<Livro> listaDeLivros = livroService.getListaDeLivros();

        assertTrue(listaDeLivros.isEmpty(), () -> "Lista de Livros não está vazia!");
    }

    @Test
    public void assertTrueBooleanSupplierComMensagemSupplier() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

//		livroService.adicionarLivro(livroRefatoracao);

        List<Livro> listaDeLivros = livroService.getListaDeLivros();

        assertTrue(() -> listaDeLivros.isEmpty(), () -> "Lista de Livros não está vazia!");
    }

}
