package Aula06;

import java.util.Scanner;

/**
 * Created by ramon on 01/04/16.
 */
public class Teclado {

    public int lerInt(){
        System.out.printf("Digite um int");
        Scanner tc = new Scanner(System.in);
        return tc.nextInt();
    }

}
