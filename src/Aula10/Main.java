package Aula10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int op=0;
        ArrayList<Livro> biblioteca = new ArrayList<>();
        do {


            System.out.println("1- para add Livro");
            System.out.println("2- para rem");
            System.out.println("3- para list");
            System.out.println("4- Aplicar descontos em todos Livros");
            System.out.println("5- para add Ebook");
            op= tc.nextInt();
            switch (op){
                case 1:{
                    Livro l= new Livro();
                    l.ler();
                    biblioteca.add(l);
                    break;
                }
                case 2:{
                    System.out.println("Digite ISBN a ser removido");
                    Livro l= new Livro(tc.next());
                    if (biblioteca.contains(l)){

                        int p = biblioteca.indexOf(l);
                        l = biblioteca.get(p);
                        System.out.println("Sera Removido!!!" + l.toString());
                        biblioteca.remove(l);
                    }else{
                        System.out.println("Erro");
                    }
                    break;
                }
                case 3:{
                    for (int i=0; i<biblioteca.size();i++){
                        Livro l= biblioteca.get(i);

                        System.out.println(l.toString());

                    }
                    break;
                }
                case 4:{
                    for (int i=0; i<biblioteca.size();i++){
                        if (biblioteca.get(i) instanceof Livro){
                            Livro l= biblioteca.get(i);
                            l.aplicarDesconto(0.1);
                        }else{
                            Ebook e = (Ebook) biblioteca.get(i);
                            e.aplicarDesconto(0.1);

                        }



                    }
                    break;
                }
                case 5:{
                    Ebook e= new Ebook();
                    e.ler();
                    biblioteca.add(e);
                }

            }

        }while (op!=99);



    }
}
