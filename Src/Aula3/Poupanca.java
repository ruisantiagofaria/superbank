package Src.Aula3;

public class Poupanca extends Conta {

public Poupanca(double NumBanco, double Saldo) {
    super(NumBanco, Saldo);
}

public double verSaldo() {
    return this.getSaldo();
}

public double meDeposito(double valor) {
    return this.getSaldo() + valor;
}
}


