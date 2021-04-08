package Heranca;

public class Cavalo extends Animal{
private String som;
private String correr;
	
	public Cavalo()
	{

}
	public Cavalo(String nome, int idade)
	{
		super(nome,idade);
	}
	
	public Cavalo(String nome,int idade, String som, String correr)
{
		super(nome,idade);
		this.som = som;
		this.correr = correr;
}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
}
}
