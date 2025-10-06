public class Conta {

//o conceito de conta

    //atributos
    private int agencia;
    private String numero;
    private double saldo;


    //métodos
    public boolean sacar(double valor) {
        if (valor <= 0) {
            return false;
        }

        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            return;
        }
        saldo += valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }


}