package main.java.livraria.service;

import main.java.livraria.exception.LivroNotFoundException;
import main.java.livraria.model.Livro;

import java.util.*;

public class LivroService {

    private List<Livro> listaDeLivros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        listaDeLivros.add(livro);
    }

    public List<Livro> getListaDeLivros() {
        return Collections.unmodifiableList(listaDeLivros);
    }

    public Livro getLivroById(Long id) {
        for (Livro livro : listaDeLivros) {
            if (id.equals(livro.getId())) {
                return livro;
            }
        }
        return null;
    }

    public Livro getLivroByAutor(String autor) {
        /* TO BE IMPLEMENTED - Tests on this method are disabled */
        return null;
    }

    public Livro getLivroByTitulo(String titulo) {
        for (Livro livro : listaDeLivros) {
            if (titulo.equals(livro.getTitulo())) {
                return livro;
            }
        }
        throw new LivroNotFoundException("Livro não encontrado na Livraria!");
    }

    public Long[] getIdsLivrosByEditora(String editora) {
        List<Long> listaDeIdsLivros = new ArrayList<>();
        for (Livro livro : listaDeLivros) {
            if (editora.equals(livro.getEditora())) {
                listaDeIdsLivros.add(livro.getId());
            }
        }
        return listaDeIdsLivros.toArray(new Long[listaDeIdsLivros.size()]);
    }

    public List<String> getTitulosLivrosByEditora(String editora) {
        List<String> listaDeTitulosLivros = new ArrayList<>();
        for (Livro livro : listaDeLivros) {
            if (editora.equals(livro.getEditora())) {
                listaDeTitulosLivros.add(livro.getTitulo());
            }
        }
        return listaDeTitulosLivros;
    }

    public List<String> getAutoresLivrosByEditora(String editora) {
        List<String> listaDeAutoresLivros = new ArrayList<>();
        for (Livro livro : listaDeLivros) {
            if (editora.equals(livro.getEditora())) {
                listaDeAutoresLivros.add(livro.getAutor());
            }
        }
        return listaDeAutoresLivros;
    }

}
