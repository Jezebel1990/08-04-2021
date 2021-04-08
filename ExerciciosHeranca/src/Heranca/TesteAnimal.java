package Heranca;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro animal1 = new Cachorro();
		Cavalo animal2 = new Cavalo();
		Preguica animal3 = new Preguica();
		
		animal1.setNome("Fuba Silva");
		animal1.setIdade(5);
		animal1.setSom("latir");
		animal1.setCorrer("lento");
		
		animal2.setNome("Alipio Luz");
		animal2.setIdade(8);
		animal2.setSom("relinchar");
		animal2.setCorrer("rápido");
		
		animal3.setNome("Soneca de Jesus");
		animal3.setIdade(7);
		animal3.setSom("espreguiçar?");
		animal3.setSubirArvores("lento");
		
		System.out.println("\n Animal-1: Cachorro --> Nome: "+ animal1.getNome() + " - Idade(anos):" + animal1.getIdade()+", emite som: "+animal1.getSom());
		System.out.println("\n Animal-2: Cavalo --> Nome: "+ animal2.getNome() +" - Idade(anos):"+ animal2.getIdade() +", emite som: "+animal2.getSom());
		System.out.println("\n Animal-3: Preguiça --> Nome: "+ animal3.getNome()+" - Idade(anos):" +animal3.getIdade() +", emite som: "+animal3.getSom());

		
	}

}
