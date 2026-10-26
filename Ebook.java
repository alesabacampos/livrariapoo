public class Ebook extends Livro {

	private String formato; //PDF, EPUB, AZW
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	public void setFormato(String formato) {
		if(formato == null)
			throw new NullPointerException("O formato não pode ser nulo!");
		this.formato = formato;
	}
	
	public String getFormato() {
		return formato;
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) 
	{
		if (porcentagem > 0.15) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}

    	@Override
    	public boolean temEstoque() {
        	return true;
    	}
	
}
