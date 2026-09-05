package Src.Aula3;

public abstract class Conta {

    private double NumConta;
    private double Numbanco;
    private double Saldo;
    private double Deposito;
    private double Saque;

    Conta(double NumBanco, double Saldo) {
        this.Numbanco = NumBanco;
        this.Saldo = Saldo;
    }
//gets and setles
public double getNumConta() {
    return NumConta;
}

public void setNumConta(double NumConta) {
    this.NumConta = NumConta;
}

public double getSaldo() {
    return Saldo;
}

public void setSaldo(double Saldo) {
    this.Saldo = Saldo;
}

public double getDeposito() {
    return Deposito;
}

public void setDeposito(double Deposito) {
    this.Deposito = Deposito;
}

public double getNumbanco() {
    return Numbanco;
}

public void setNumbanco(double Numbanco) {
    this.Numbanco = Numbanco;
}

public double getSaque() {
    return Saque;
}

public void setSaque(double Saque) {
    this.Saque = Saque;
}
}