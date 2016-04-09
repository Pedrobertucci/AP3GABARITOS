package Aula07;

/**
 * Created by ramon on 08/04/16.
 */
public class Banco {

    public static void main(String[] args) {
        Conta c = new Conta();
        System.out.println(c.toString());
        Cliente a= new Cliente("098309","1213");
        Conta c2 = new Conta(a,3000);
        c2.setAgencia(4567);
        c2.setCliente(a);
        System.out.println(c2.toString());

      }
}
