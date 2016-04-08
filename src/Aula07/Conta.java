package Aula07;

/**
 * Created by ramon on 08/04/16.
 */
public class Conta {
    public static int nconta;
    public static double limite;
    private Cliente cliente;
    private int numero;
    private int agencia;
    private int saldo;

    public Conta(Cliente s){
        nconta++;
        this.setNumero(nconta);
        this.setCliente(s);

    }
    public Conta(Cliente s, int valor){
        nconta++;
        this.setNumero(nconta);
        this.setCliente(s);
        this.setSaldo(valor);

    }
    public Conta(){
        nconta++;
        this.setNumero(nconta);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public static void mostrarAlertaLimite(){
        System.out.println("O limite padrão é"+ limite );
    }


    @Override
    public String toString() {
        return "Conta{" +
                "cliente='" + cliente + '\'' +
                ", numero='" + numero + '\'' +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                '}';
    }
}
