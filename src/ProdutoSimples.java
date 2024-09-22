public class ProdutoSimples implements Produto {
    private String nome;
    private double preco;

    public ProdutoSimples(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return nome;
    }
}
