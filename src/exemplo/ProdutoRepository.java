package exemplo;

import com.sun.istack.internal.NotNull;
import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {

    private Map<String, Produto> catalogo = new HashMap<>();

    public String addProduto(Produto produto){
        catalogo.put(produto.getId(), produto);
        return produto.getId();
    }

    public void removeProduto(@NotNull Produto produto){
        catalogo.remove(produto.getId());
    }

    public Produto getProduto(String ID){
        return catalogo.get(ID);
    }

    public String listaProdutos(){
        String saida = "LISTA DE PRODUTOS:\n";
        for (Produto produto: catalogo.values()){
            saida += produto.toString();
            saida += "\n";
        }
        return saida;
    }

    public void atualizaProduto(Produto produto){
        catalogo.put(produto.getId(), produto);
    }
}
