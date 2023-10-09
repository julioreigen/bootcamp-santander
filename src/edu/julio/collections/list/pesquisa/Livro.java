package edu.julio.collections.list.pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;

    public Livro(String titulo, String autor, int anoPublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicado() {
        return anoPublicado;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "Titulo: " + titulo + " - " +
                "Autor: " + autor + " - " +
                "Ano: " + anoPublicado +
                '}';
    }
}
