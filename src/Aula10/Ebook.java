package Aula10;

import java.util.Scanner;

/**
 * Created by ramon on 29/04/16.
 */
public class Ebook extends Livro {

    private String marcaDagua;

    public String getMarcaDagua() {
        return marcaDagua;
    }

    public void setMarcaDagua(String marcaDagua) {
        this.marcaDagua = marcaDagua;
    }
    public void aplicarDesconto(double p){
        p= p*2;
        this.setValor(  this.getValor() - this.getValor() * p );
    }


    public void ler(){
        Scanner tc= new Scanner(System.in);
        super.ler();
        System.out.println("Digite Marca Dagua ");
        this.setMarcaDagua(tc.nextLine());

    }

    @Override
    public String toString() {
        return   "titulo='" + this.getTitulo() + '\'' +
                ", Autor=" + this.getAutor() +
                ", isbn='" + this.getIsbn() + '\'' +
                ", Valor=" + this.getValor() +               ", " +
                " " + this.getMarcaDagua() +

                '}';
    }


}
