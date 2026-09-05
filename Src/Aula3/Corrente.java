package Src.Aula3;

public class Corrente extends Conta {
    public Corrente(double numconta, double saldo) {
        super(numconta, saldo);
    }

    public double versaldo() {
        return this.getSaldo();
    }

    public double deposito(double valor) {
        this.setDeposito(valor);
        return this.getSaldo();
    }

    public static class principal {
        public static void main(String[] args) {
            System.out.println(new Corrente(1.1, 0.0).versaldo());
        }
    }
}
