package Hospital;

/**
 * Created by ramon on 08/04/16.
 */
public class Main {
    public static void main(String[] args) {
        CertidaoNascimento[] vet = new CertidaoNascimento[5];
        int cont=0;
        CertidaoNascimento cn = new CertidaoNascimento();
        cn.gerarCertidao();
        cn.mostrarCertidao();
        vet[cont]=cn;
        cont++;

        CertidaoNascimento.buscarRN("Pedro",vet,cont);




    }
}
