package Heranca;

public class Preguica extends Animal{
private String som;
private String subirArvores;
	
	public Preguica()
	{

}
	public Preguica(String nome, int idade)
	{
		super(nome,idade);
	}
	
	public Preguica(String nome,int idade, String som,String subirArvores)
{
		super(nome,idade);
		this.som = som;
		this.subirArvores = subirArvores;
}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getSubirArvores() {
		return subirArvores;
	}
	public void setSubirArvores(String subirArvores) {
		this.subirArvores = subirArvores;
}
}


