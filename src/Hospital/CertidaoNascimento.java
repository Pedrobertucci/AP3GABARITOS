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
        nascidoVivo=rn;
        char op;
        do {
            System.out.println("Informe Dados do Genitores " + nPais);
            Pessoa p= new Pessoa();
            p.ler();
            pais[nPais]=p;
            nPais++;
            System.out.println("Mais algum pai/mae? S ou N");
            op=tc.next().charAt(0);
        }while (op!='n');

    }

    public void mostrarCertidao(){
        System.out.println("Nascido no hosppital "+nascidoVivo.hospital);
        System.out.println(nascidoVivo.nome);
        System.out.println(nascidoVivo.peso);
        System.out.println("Data :"+ nascidoVivo.data );
        System.out.println("Hora :"+ nascidoVivo.hora );
        System.out.println("Filho de:");
        for(int i=0;i<nPais; i++){
            if (pais[i].paternidade=='p'){
                System.out.println("Pai "+ pais[i].nome);
                System.out.println("Avo "+ pais[i].pai);
                System.out.println("Avó "+ pais[i].mae);


            }else{
                System.out.println("Mae "+ pais[i].nome);
                System.out.println("Avo "+ pais[i].pai);
                System.out.println("Avó "+ pais[i].mae);

            }
        }


    }

    public static void buscarRN(String busca,CertidaoNascimento[] vet, int qtd) {
        for (int i = 0; i < qtd; i++) {
            if (vet[i].nascidoVivo.nome.equals(busca)) {
                System.out.println("Encontrado" + busca);

            } else {
                System.out.println("não Encontrado");

            }

        }
    }

}
