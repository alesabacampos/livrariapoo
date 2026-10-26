public class Revista implements Produto, Promocional, Estoque {

	private String nome;
	private double valor;
	private Editora editora;
	private int qtdeEstoque;
	
	public Revista(String nome, double valor, Editora editora)
	{
		this.nome = nome;
		this.valor = valor;
		this.editora = editora;
	}

	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		if(nome == null)
			throw new NullPointerException("Nome não pode ser nulo!");
		this.nome = nome;
	}
	
	@Override
	public double getValor()
	{
		return valor;
	}
	
	public void setValor(double valor)
	{
		this.valor = valor;
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.1) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s", nome);
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
