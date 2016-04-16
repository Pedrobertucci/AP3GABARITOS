package Aula10;

import java.util.Scanner;

/**
 * Created by ramon on 29/04/16.
 */
public class Autor {

    private String nome;
    private String email;

    public String getNome() {
        return nome.toLowerCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email.toLowerCase();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;

        if (!nome.equals(autor.nome)) return false;
        return email.equals(autor.email);

    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }

    public void ler(){
        Scanner tc= new Scanner(System.in);
        System.out.println("Digite nome do autor");
        this.setNome(tc.next());
        System.out.println("Digite email do autor");
        this.setEmail(tc.next());

    }

    @Override
    public String toString() {
        return "Nome:'" + this.getNome() + '\'' +
                "- email:'" + this.getEmail();
    }
}
