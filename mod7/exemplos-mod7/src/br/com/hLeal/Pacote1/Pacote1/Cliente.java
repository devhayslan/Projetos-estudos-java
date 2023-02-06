package br.com.hLeal.Pacote1.Pacote1;

/**
 * @classPacote br.com.hLeal.Pacote1
 *
 * @author haysl
 * @version 1.0
 */
public class Cliente {

    private int codigo;

    private String nome;

    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarEndereco(String endereco) {
        setEndereco(endereco);
    }

    public void imprimirEndereco() {
        System.out.println(this.endereco);
    }

    public String retornarNomeCliente() {
        return "Endereco do Hayslan";
    }

    public int getValorTotal() {
        return 20;
    }
}
