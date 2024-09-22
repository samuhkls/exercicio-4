public class Main {
    public static void main(String[] args) {
        // Criando produtos simples
        Produto produto1 = new ProdutoSimples("Produto A", 10.0);
        Produto produto2 = new ProdutoSimples("Produto B", 15.0);
        Produto produto3 = new ProdutoSimples("Produto C", 20.0);

        // Criando uma caixa e adicionando produtos a ela
        Caixa caixa1 = new Caixa("Caixa 1");
        caixa1.adicionarProduto(produto1);
        caixa1.adicionarProduto(produto2);

        // Criando outra caixa e adicionando produtos a ela
        Caixa caixa2 = new Caixa("Caixa 2");
        caixa2.adicionarProduto(produto3);

        // Criando o carrinho de compras (pedido)
        Pedido pedido = new Pedido("João Silva", 1);
        pedido.adicionarProduto(caixa1);
        pedido.adicionarProduto(caixa2);

        // Calculando o total da compra
        pedido.calcularTotal();

        // Imprimindo detalhes do pedido
        pedido.imprimirDetalhes();
    }
}
