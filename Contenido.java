public abstract class Contenido {
    private String titulo;
    private String autor;

    public Contenido(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public abstract String tipo();

    public String toString() {
        return tipo() + ": " + titulo + " - " + autor;
    }
}
