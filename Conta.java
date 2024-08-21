public class Conta {
    Cliente titular;
    double saldo;
    int agencia;
    int numero;

    void depositar(double valor){
        saldo += valor;
    }

    boolean sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    void transferir(double valor, Conta contaDestino){
        boolean conseguiuSacar = this.sacar(valor);

        if (conseguiuSacar){
            contaDestino.depositar(valor);
        }
    }

}
