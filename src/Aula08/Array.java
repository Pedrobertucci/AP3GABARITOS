package Aula08;

import java.util.ArrayList;

/**
 * Created by ramon on 15/04/16.
 */
public class Array {

    public static void main(String[] args) {

    /*    ArrayList<String> lista =new ArrayList<String>();
        lista.add("Ramon");
        lista.add("Leonardo");
        lista.add(1,"Djian");

        lista.remove("Ramon");

        lista.set(1,"Luis");


        for (int i=0;i<lista.size();i++){
            System.out.println( lista.get(i))   ;
        }

     if( lista.contains("Djian")){
         System.out.println("Encontrado");
         int p = lista.indexOf("Djian");
        // lista.remove(p);
         //lista.remove(lista.indexOf("Djian"));

     }else{
         System.out.println("Não Encontrado");
     }

*/
        ArrayList<Filmes> locadora = new ArrayList<Filmes>();


        Filmes f1= new Filmes();
        f1.setTitulo("Sharknado");
        f1.setSinopse("THE BEST");
        Ator a= new Ator();
        a.setNome("ramon");
        a.setIdade(30);
        f1.setAtorPrincipal(a);
        locadora.add(f1);
        //f1.setAtorPrincipal(new Ator("ramon",30));

        Filmes f2= new Filmes();
        f2.setTitulo("Tubarão Zumbi");
        f2.setSinopse("THE BEST ZOMBIE");
        f2.setAtorPrincipal(a);

        locadora.add(f2);





        Filmes busca=new Filmes("Sharknado");
        if( locadora.contains(busca)){
            System.out.println("Encontrado");

        }else{
            busca.ler();

            locadora.add(busca);
        }

        System.out.println( locadora.indexOf(f2));

        locadora.remove(busca);//2
        locadora.set(0,busca);
        /*if (f1.equals(f2)){
            System.out.println("CANAL SYFY");
        }else{
            System.out.println("TELECINE");
        }*/

    }
}
