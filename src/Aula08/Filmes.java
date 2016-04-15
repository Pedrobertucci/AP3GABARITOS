package Aula08;

/**
 * Created by ramon on 15/04/16.
 */
public class Filmes {

    private String titulo;
    private String sinopse;
    private Ator atorPrincipal;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Ator getAtorPrincipal() {
        return atorPrincipal;
    }

    public void setAtorPrincipal(Ator atorPrincipal) {
        this.atorPrincipal = atorPrincipal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Filmes filmes = (Filmes) o;

        return titulo != null ? titulo.equals(filmes.titulo) : filmes.titulo == null;

    }

    public Filmes(String titulo) {
        this.titulo = titulo;
    }

    public Filmes() {

    }

    @Override
    public String toString() {
        return "Filmes{" +
                "titulo='" + titulo + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", atorPrincipal=" + atorPrincipal +
                '}';
    }

    public void ler() {
    }
}
