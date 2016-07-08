package Revisao;

/**
 * Created by ramon on 08/07/16.
 */
public class Pokemon {
   private String nome;
   private String tipo;
    private  int nivel;

   public void atacar(){
        System.out.println("Ataque do pokemon");
    }
  public   void atacar(String nomeDoAtaque){
        System.out.println("Ataque do pokemon" +nomeDoAtaque);
    }
    public void evoluir(){
        nivel++;
    }
   public void defender(){
        System.out.println("Defesa do pokemon");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if(this.nivel+1== nivel){
        this.nivel = nivel;
    }
    }

    public     Pokemon (String n, String t){
        nivel=1;
        this.nome=n;
        this.tipo=t;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nivel=" + nivel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pokemon pokemon = (Pokemon) o;

        if (nome != null ? !nome.equals(pokemon.nome) : pokemon.nome != null) return false;
        return tipo != null ? tipo.equals(pokemon.tipo) : pokemon.tipo == null;

    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        return result;
    }
}
