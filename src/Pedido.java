import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nomeCliente;
    private List<Produto> lista = new ArrayList<>();
    private int numeroPedido;
    private double totalCompra;

    public Pedido(String nomeCliente, int numeroPedido) {
        this.nomeCliente = nomeCliente;
        this.numeroPedido = numeroPedido;
    }

    public void adicionarProduto(Produto produto) {
        lista.add(produto);
    }

    public void calcularTotal() {
        totalCompra = 0;
        for (Produto produto : lista) {
            totalCompra += produto.getPreco();
        }
    }

    public void imprimirDetalhes() {
        System.out.println("Pedido #" + numeroPedido + " - Cliente: " + nomeCliente);
        System.out.println("Produtos:");
        for (Produto produto : lista) {
            System.out.println(produto.getDescricao());
        }
        System.out.println("Total da Compra: R$ " + totalCompra);
    }
}
