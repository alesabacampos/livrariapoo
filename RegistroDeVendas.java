public class RegistroDeVendas {

	public static void main(String[] args) {
	
		Autor autor = new Autor("Mauricio", "Aniche");
		Editora editora = new Editora("Editora Abril", "Abril Comunicações S.A.", "44.597.052/0001-62");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setTitulo("Test-Driven Development");
		fisico.setValor(59.90);
		fisico.setQtdeEstoque(100);

		Ebook ebook = new Ebook(autor);
		ebook.setTitulo("Test-Driven Development");
		ebook.setFormato("PDF");
		ebook.setValor(29.90);
		
		Revista revista = new Revista("Super interessante", 10.99, editora);
		revista.setQtdeEstoque(100);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		carrinho.adiciona(revista);
		
		System.out.println("\n\nTotal "  + String.format("%.2f", carrinho.getTotal()));
	}
}
