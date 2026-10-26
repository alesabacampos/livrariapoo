public class CarrinhoDeCompras {

	private double total;

	public void adiciona(Produto produto) {
	
		if (!produto.temEstoque()) {
            	System.out.println("Produto esgotado!");
            		return;
        	}
        
		if (produto instanceof LivroFisico) {
        		LivroFisico livro = (LivroFisico) produto;
        		livro.aplicaDescontoDe(0.05);
        		livro.decEstoque(1);
    		}
    		
    		if (produto instanceof Ebook)
		{
			Ebook ebook = (Ebook) produto;
			ebook.aplicaDescontoDe(0.10);
			System.out.printf("O produto abaixo é um ebook em formato %s. %n", ebook.getFormato());
		}
    		
    		if (produto instanceof Revista) {
        		Revista revista = (Revista) produto;
        		revista.aplicaDescontoDe(0.05);
        		revista.decEstoque(1);
    		}
    		System.out.println("Adicionando: " + produto + " no valor de R$ " + String.format("%.2f", produto.getValor()));
		total += produto.getValor();
	}
	
	public double getTotal() {
		return total;
	}
}
