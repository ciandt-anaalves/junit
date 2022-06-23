package main.java.livraria.exception;

public class LivroNotFoundException extends RuntimeException {

    public LivroNotFoundException(String mensagem) {
        super(mensagem);
    }

}
