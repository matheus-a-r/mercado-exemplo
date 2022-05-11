import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;
import exemplo.LoteRepository;

public class Sistema {

	public static void main(String[] args) {

		Produto leite = new Produto("Leite", "Parmalat");
		Produto pao = new Produto("Pão", "Poli Massas");
		Produto ovo = new Produto("Ovo", "Granja Comary");
		Lote loteLeite = new Lote(leite, 10L);
		Lote lotePao = new Lote(pao, 30L);
		Lote loteOvo = new Lote(ovo, 20L);
		ProdutoRepository catalogo = new ProdutoRepository();
		String idLeite = catalogo.addProduto(leite);
		String idPao = catalogo.addProduto(pao);
		String idOvo = catalogo.addProduto(ovo);
		Produto novoLeite = catalogo.getProduto(idLeite);
		novoLeite.setFabricante("Italacc");
		catalogo.atualizaProduto(novoLeite);
		System.out.println(catalogo.listaProdutos());
	}
}
