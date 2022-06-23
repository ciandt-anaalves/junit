package test.java.assertions.assertFalse;

import main.java.livraria.model.Livro;
import main.java.livraria.service.LivroService;

import java.util.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class assertFalse {


    @Test
    public void assertFalseSemMensagem() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

        livroService.adicionarLivro(livroRefatoracao);

        List<Livro> listaDeLivros = livroService.getListaDeLivros();

        assertFalse(listaDeLivros.isEmpty());
    }

    @Test
    public void assertFalseSemMensagemBooleanSupplier() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

        livroService.adicionarLivro(livroRefatoracao);

        List<Livro> listaDeLivros = livroService.getListaDeLivros();

        assertFalse(() -> listaDeLivros.isEmpty());
    }

    @Test
    public void assertFalseComMensagem() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

        livroService.adicionarLivro(livroRefatoracao);

        List<Livro> listaDeLivros = livroService.getListaDeLivros();

        assertFalse(listaDeLivros.isEmpty(), "Lista de Livros está vazia!");
    }

    @Test
    public void assertFalseBooleanSupplierComMensagem() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

        livroService.adicionarLivro(livroRefatoracao);

        List<Livro> listaDeLivros = livroService.getListaDeLivros();

        assertFalse(() -> listaDeLivros.isEmpty(), "Lista de Livros está vazia!");
    }

    @Test
    public void assertFalseComMensagemSupplier() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

        livroService.adicionarLivro(livroRefatoracao);

        List<Livro> listaDeLivros = livroService.getListaDeLivros();

        assertFalse(listaDeLivros.isEmpty(), () -> "Lista de Livros está vazia!");
    }

    @Test
    public void assertFalseBooleanSupplierComMensagemSupplier() {
        LivroService livroService = new LivroService();

        Livro livroRefatoracao = new Livro(1L, "Refatoração: Aperfeiçoando o Design de Códigos Existentes", "Novatec Editora", "Martin Fowler");

        livroService.adicionarLivro(livroRefatoracao);

        List<Livro> listaDeLivros = livroService.getListaDeLivros();

        assertFalse(() -> listaDeLivros.isEmpty(), () -> "Lista de Livros está vazia!");
    }

}
