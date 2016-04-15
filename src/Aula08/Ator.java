package Aula08;

/**
 * Created by ramon on 15/04/16.
 */
public class Ator {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ator ator = (Ator) o;

        if (idade != ator.idade) return false;
        return nome != null ? nome.equals(ator.nome) : ator.nome == null;

    }

    public Ator(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Ator() {

    }

    @Override
    public String toString() {
        return "Ator{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
