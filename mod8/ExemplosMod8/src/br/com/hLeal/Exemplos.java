package br.com.hLeal;

public class Exemplos {

    private int codigo;

    private long codigoMaior;

    private double valorDecimal;

    private String texto;

    private boolean status;



    private float valorDecimalAbaixo;

    private short shor;

    private byte bi;


    public Exemplos() {

    }

    public Exemplos(int val) {
        this.codigo = val;
    }

    public String retornarTexto () {
        this.codigo = 0;
        return "Exemplo de retorno";
    }

    public int retornarInteiro() {
        int val =10;
        String texto = "Texto";
        this.texto = null;
        return val;
    }

    public long retornarlong(long num) {
        this.texto = "asds";
        return num;
    }
}
