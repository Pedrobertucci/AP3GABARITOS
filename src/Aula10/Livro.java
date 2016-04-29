package Aula10;

import java.util.Scanner;

/**
 * Created by ramon on 29/04/16.
 */
public class Livro {

    private String titulo;
    private Autor Autor;
    private String isbn;
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aula10.Autor getAutor() {
        return Autor;
    }

    public void setAutor(Aula10.Autor autor) {
        Autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return   "titulo='" + this.getTitulo() + '\'' +
                ", Autor=" + Autor +
                ", isbn='" + isbn + '\'' +
                ", Valor=" + this.valor +
                '}';
    }

    public void ler(){
        Scanner tc= new Scanner(System.in);
        System.out.println("Digite titulo");
        this.setTitulo(tc.next());
        System.out.println("Digite Valor");
        this.setValor(tc.nextDouble());
        System.out.println("Digite isbn ");
        this.setIsbn(tc.next());
        Aula10.Autor a = new Autor();
        a.ler();
        this.setAutor(a);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        return isbn != null ? isbn.equals(livro.isbn) : livro.isbn == null;

    }

    @Override
    public int hashCode() {
        return isbn != null ? isbn.hashCode() : 0;
    }

    public Livro(String isbn) {
        this.isbn = isbn;
    }
    public Livro(){

    }

    public void aplicarDesconto(double p){
        this.valor = this.valor - this.valor * p;

    }

}
