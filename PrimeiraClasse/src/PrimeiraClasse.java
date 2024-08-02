public class PrimeiraClasse {

    public static void main(String[] args) {
        System.out.println("Ola Daniel");
        Cliente cliente = new Cliente ();
        cliente.cadastrarEndereco("Rua 3");
        cliente.setCodigo(3);
        System.out.println(cliente.getCodigo());
        //cliente.imprimirEndereco()
        System.out.println(cliente.retornarNomeCliente());
        System.out.println(cliente.getValorTotal());
    }
}
