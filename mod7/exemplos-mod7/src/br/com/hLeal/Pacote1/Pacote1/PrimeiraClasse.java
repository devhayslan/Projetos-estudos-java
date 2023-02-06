package br.com.hLeal.Pacote1.Pacote1;

/**
 * @see Cliente
 *
 *
 *
 *
 * @author haysl
 */
public class PrimeiraClasse {
    public static void main(String [] args) {
        System.out.println("Olá Hayslan");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        //cliente.imprimirEndereco();
        //String end = cliente.retornarNomeCliente();
        System.out.println(cliente.retornarNomeCliente());
        System.out.println(cliente.getValorTotal());
    }
}
