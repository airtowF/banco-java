package dominios;

public class Conta {
    Cliente titular;

    private double saldo;
    int agencia;
    int numero;

    public double mostrarSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public boolean sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void transferir(double valor, Conta contaDestino){
        boolean conseguiuSacar = this.sacar(valor);

        if (conseguiuSacar){
            contaDestino.depositar(valor);
        }
    }

}
