package ExercicioMercado;

public class TesteMercadinho {
	public static void main(String[] args) {

		Produto cerveja = new BebidaAlcoolica("gin", 12.00, 4.6);
		Produto vinho = new BebidaAlcoolica("cerveja", 150.00, 8);
		Produto tv = new Eletrodomestico("fogao", 2000.00, 120);
		Produto geladeira = new Eletrodomestico("tv", 2352.64, 220);
		Produto radio = new Eletrodomestico("Radio", 837.59, 110);
		
		Carrinho carrinho  = new Carrinho();
		carrinho.addItem(new Item(5, vinho));
		carrinho.addItem(new Item(3, cerveja));
		carrinho.addItem(new Item(9, fogao));
		carrinho.addItem(new Item(3, tv));
		carrinho.addItem(new Item(1, radio));
		
		for(Item item : carrinho.getItens()) {
			Produto produto = item.getProduto();
			System.out.printf(produto + "Subtotal: R$ %.2f Quantidade: %d\n", produto.Vender(item.getQuantidadeDeItens()), item.getQuantidadeDeItens());
		}
		
		
		System.out.printf("\n\nTotal da compra: %.2f", carrinho.getValorTotal());
	}

}


