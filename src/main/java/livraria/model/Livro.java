package main.java.livraria.model;

import java.io.Serializable;
import java.util.Objects;

public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String titulo;
    private String editora;
    private String autor;

    public Livro() { }

    public Livro(Long id, String titulo, String editora, String autor) {
        setId(id);
        setTitulo(titulo);
        setEditora(editora);
        setAutor(autor);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(id, livro.id) && Objects.equals(titulo, livro.titulo) && Objects.equals(editora, livro.editora) && Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, editora, autor);
    }

}
