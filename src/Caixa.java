import java.util.ArrayList;
import java.util.List;

public class Caixa implements Produto {
    private String nome;
    private List<Produto> produtos = new ArrayList<>();

    public Caixa(String nome) {
        this.nome = nome;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    @Override
    public String getDescricao() {
        StringBuilder descricao = new StringBuilder(nome + " contém:\n");
        for (Produto produto : produtos) {
            descricao.append("- ").append(produto.getDescricao()).append(" (R$ ").append(produto.getPreco()).append(")\n");
        }
        return descricao.toString();
    }
}
