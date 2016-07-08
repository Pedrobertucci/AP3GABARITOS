package Revisao;

import Aula08.Array;

import java.util.ArrayList;

/**
 * Created by ramon on 08/07/16.
 */
public class Main {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("pikachu","Eletrico");
        Pokemon p3 = new Pokemon("pikachu","Eletrico");
        System.out.println( p1.toString());
        p1.setNivel(2);
        p1.evoluir();
        System.out.println( p1.toString());
        PokemonAquatico p2 = new PokemonAquatico("Squirtle", "Aquatico");
        p2.jatoDagua();

        ArrayList<Pokemon> pokedex = new ArrayList<Pokemon>();

        pokedex.add(p1);
        if(pokedex.isEmpty()){
            System.out.println("Va cata pokemon");
        }else{
            System.out.println("Vai carpi um lote");
        }

        if(p1.equals(p3)){
            System.out.println("Pokemon igual");
            pokedex.remove(p3);
        }else{
            System.out.println("Pokemon diferente");
        }


        System.out.println( pokedex.contains(p1));
       // int p=pokedex.indexOf(p1);
      //  pokedex.remove(p);
     //   System.out.println(pokedex.indexOf(p1));
        System.out.println(pokedex.size());


        pokedex.add(p1);
        pokedex.add(p1);
        System.out.println(pokedex.size());


        pokedex.get(0).toString();


        for(int i=0;i<pokedex.size();i++){
          Pokemon p = pokedex.get(i);
            System.out.println(   p.toString());
        }




    }
}
