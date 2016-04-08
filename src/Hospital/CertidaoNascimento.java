package Hospital;

import java.util.Scanner;

/**
 * Created by ramon on 08/04/16.
 */
public class CertidaoNascimento {
    public CertidaoNascidoVivo nascidoVivo;
    public Pessoa[] pais = new Pessoa[10];
    public int nPais;

    public void gerarCertidao(){
        Scanner tc= new Scanner(System.in);
        System.out.println("Informe dados da certidão de Nascido Vivo");
        CertidaoNascidoVivo rn = new CertidaoNascidoVivo();
        rn.ler();
        char op;
        do {
            System.out.println("Informe Dados do pais" + nPais + 1);
            Pessoa p= new Pessoa();
            p.ler();
            pais[nPais]=p;
            nPais++;
            System.out.println("Mais algum pai/mae? S ou N");
            op=tc.next().charAt(0);
        }while (op!='n');

    }

}
