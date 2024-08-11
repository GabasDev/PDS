package conta;

public class ContaBancaria {
    private String nomeCliente;
    private String cpfCliente;
    private double saldo;

    public ContaBancaria(String nomeCliente, String cpfCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (this.saldo == 0) {
            System.out.println("Não é possível sacar. Saldo atual é zero.");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Cliente: Ednaldo Perreira", "123.456.789-00");
        System.out.println(conta.nomeCliente);

        conta.depositar(1000.0);
        conta.exibirSaldo();

        conta.sacar(500.0);
        conta.exibirSaldo();

        conta.sacar(700.0); 
        conta.exibirSaldo();

        conta.depositar(-200.0);
    }
}
