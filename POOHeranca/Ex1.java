package POOHeranca;

public class Ex1 {

	public static void main(String[] args) {
		
		
		Cachorro perro = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguiça bu = new Preguiça();
		
		perro.setNome("Astolfo");
		horse.setNome("Alazao");
		bu.setNome("Jandira");
		
		perro.setIdade(5);
		horse.setIdade(8);
		bu.setIdade(12);
		
		
		perro.setSom("Rolf Rolf");
		horse.setSom("nhihihihihi");
		bu.setSom("nhaaaaaa");
		
		
		System.out.println(perro.getNome()+" tem "+perro.getIdade()+
				" anos de idade, o som do Astolfo é "+perro.getSom() );
		perro.correr();
		System.out.println(horse.getNome()+" tem "+horse.getIdade()+ 
				" anos de idade, o som do Alazao é "+horse.getSom());
		horse.correr();
		System.out.println(bu.getNome()+" tem "+bu.getIdade()+
				" anos de idade, o som da Jandira é " +bu.getSom());
		bu.subir();
		
		
		
		
		
		
	
	}

}
