package Hospital;

import java.util.Scanner;

/**
 * Created by ramon on 08/04/16.
 */
public class CertidaoNascidoVivo {

    /*
    * A certidão de nascido vivo é emitido pelo hospital,
     * contendo nome do hospital, nome do recém nascido ,
     * nome dos pais, peso, data de nascimento e hora do parto.

 *
    * */

    String hospital;
    double peso;
    String nome;
    String nomeP;
    String nomeM;
    String data;
    String hora;

    public void ler(){
        Scanner tc= new Scanner(System.in);
        System.out.println("Digite nome do Hospital");
        this.hospital= tc.nextLine();
       System.out.println("Digite nome do RN");
        this.nome= tc.nextLine();
        System.out.println("Digite nome do PAI");
        this.nomeP= tc.nextLine();
        System.out.println("Digite nome do MAE");
        this.nomeM= tc.nextLine();
        System.out.println("Digite Data");
        this.data= tc.nextLine();
        System.out.println("Digite Hota");
        this.hora= tc.nextLine();
        System.out.println("Digite peso");
        this.peso= tc.nextFloat();

    }


}
