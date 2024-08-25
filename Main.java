public class Main {
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.titular = new Cliente();

        conta.titular.nome  = "Pedro";
        conta.titular.cpf = "987654";
        conta.titular.profissao = "Pedreiro";
        conta.titular.salario = 900;


        System.out.println(conta.titular.nome);

    }
}