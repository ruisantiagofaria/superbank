package Src.Aula4;

interface IAuto {
    int Trocarmarcha(int valor);
}

public class carro implements IAuto {
    //private String marcha;
    //private String modelo;
    //private String acao;

    public double acelerar(double valor) {
        return valor;
    }
    public double parar(double valor) {
        return valor;
    }

    @Override
    public int Trocarmarcha (int valor) {
        return valor;
    }
}