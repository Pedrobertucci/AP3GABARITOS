package Hospital;

import java.util.Scanner;

/**
 * Created by ramon on 08/04/16.
 */
public class Pessoa {

    /*
    * O RG possui nome dos pais, nome dos avós,
     * numero de identificação. Dos pais também é
     * necessário informa profissão e endereço.
    *
    * */

    String nome;
    String pai;
    String mae;
    String rg;
    String profissao;
    String endereco;
    char paternidade;

    public void ler(){
        Scanner tc= new Scanner(System.in);
        System.out.println("Digite nome");
        this.nome= tc.nextLine();
        System.out.println("Digite nome do Pai");
        this.pai= tc.nextLine();
        System.out.println("Digite nome da ae");
        this.mae= tc.nextLine();
        System.out.println("Digite RG");
        this.rg= tc.nextLine();
        System.out.println("Digite profissão");
        this.profissao= tc.nextLine();
        System.out.println("Digite End");
        this.endereco= tc.nextLine();
        System.out.println("Digite (p)ai ou (m)ãe");
        this.paternidade= tc.next().charAt(0);

    }

}
