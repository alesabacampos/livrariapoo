public class MiniLivro extends Livro implements Estoque {

	private int qtdeEstoque;

	public MiniLivro(Autor autor) {
		super(autor);
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}
	
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	
	@Override
	public int getQtdeEstoque() {
        	return qtdeEstoque;
	}
	
	@Override
	public boolean temEstoque() {
        	return qtdeEstoque > 0;
	}
	
	@Override
	public void decEstoque(int qtdeCompra) {
        	if (qtdeEstoque >= qtdeCompra) {
            		qtdeEstoque -= qtdeCompra;
        	} else {
            		System.out.println("Fora do estoque!");
        	}
    	}
}
