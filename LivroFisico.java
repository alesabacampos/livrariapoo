public class LivroFisico extends Livro implements Estoque {

	private boolean compraOnline;
	private int qtdeEstoque;

	public LivroFisico(Autor autor) {
		super(autor);
	}

	public double getTaxaImpressao() {
		return getValor() * 0.05;
	}
	
	public boolean getCompraOnline() {
		return compraOnline;
	}
	
	public void setCompraOnline(boolean compraOnline) {
		this.compraOnline = compraOnline;
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.3) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}
	
	public void setQtdeEstoque(int qtdeEstoque) {
		if(qtdeEstoque < 0)
			throw new IllegalArgumentException("A quantidade de estoque deve ser maior ou igual a zero!");
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
