public class ContaBancaria {
    private double saldo;
    private int numeroConsultas;

    
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        this.numeroConsultas = 0;
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            double taxa = valor * 0.01; 
            saldo += (valor - taxa); 
            System.out.println("Depósito realizado com sucesso. Taxa cobrada: " + taxa);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    
    public void sacar(double valor) {
        if (valor > 0) {
            double taxa = valor * 0.005; 
            if (saldo >= (valor + taxa)) {
                saldo -= (valor + taxa); 
                System.out.println("Saque realizado com sucesso. Taxa cobrada: " + taxa);
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    
    public void consultarSaldo() {
        numeroConsultas++;
        if (numeroConsultas % 5 == 0) {
            saldo -= 0.10; 
            System.out.println("Consulta número " + numeroConsultas + ". Taxa de consulta de R$ 0,10 cobrada.");
        } else {
            System.out.println("Consulta número " + numeroConsultas + ". Nenhuma taxa cobrada.");
        }
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    
    public double getSaldo() {
        return saldo;
    }
}