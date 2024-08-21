import java.security.cert.CertPath;

public class Main {
    public static void main(String[] args) {
        Cliente clientePedro = new Cliente();
        Conta conta = new Conta();

        clientePedro.nome = "Pedro";
        clientePedro.cpf = "987654";
        clientePedro.profissao = "Pedreiro";
        clientePedro.salario = 900;

        conta.titular = clientePedro;

        System.out.println(conta.titular.nome);


    }
}