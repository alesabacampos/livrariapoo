public class Autor {

	private String nome;
	private String sobrenome;
	
	public Autor(String nome, String sobrenome)
	{
		if(nome == null)
			throw new NullPointerException("O autor deve ter um nome!");
		if(sobrenome == null)
			throw new NullPointerException("O autor deve ter um sobrenome!");

		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public void setNome(String nome)
	{
		if(nome == null)
			throw new NullPointerException("O autor deve ter um nome!");
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setSobrenome(String sobrenome)
	{
		if(sobrenome == null)
			throw new NullPointerException("O autor deve ter um sobrenome!");

		this.sobrenome = sobrenome;
	}
	
	public String getSobrenome()
	{
		return sobrenome;
	}
	
}
