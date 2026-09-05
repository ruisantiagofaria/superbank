class Corrente extends Conta {


private String Nomecli;
private String Cpfcli;

    public double saldo(double saldo) {
    return saldo;
    }

    public double depositar (double valordep) {
        return valordep;
    }

    public double sacar (double valorsac) {
        return valorsac;
    }


    public void abrirConta() {
      this.setNumbank(101);
            this.setNumero(10.114);

            //Dados cliente
            System.out.println("Sua conta do banco é: " + this.getNumbank() +
              "\n Sua conta corrente é: " + this.getNumero() +
              "\n Nome do cliente: " + this.getNomecli() +
              "\n CPF do cliente: " + this.getCpfcli());
           

    }

    

    //Getters e Setter

 public String getNomecli() {
    return Nomecli;
 }
 public void setNomecli (String nomecli) {
    this.Nomecli = nomecli;
 }

 public String getCpfcli() {
    return Cpfcli;
 }

 public void setCpfcli (String cpfcli) {
    this.Cpfcli = cpfcli;
 }


}





