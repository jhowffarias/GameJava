import java.util.Random;
public class Combate {
	Combatentes Combatente1 = new Combatentes("Humano", 100, 5, 100);
	Combatentes Combatente2 = new Combatentes("Ogro", 100, 8, 100);		
		
	public int calcularDano() {
		Random random = new Random();
		int ataque = random.nextInt(10);
		return ataque;
	}
	
	public String batalha() {

		//Sorteio de quem inicia
		Random random = new Random();
		int sorteio = random.nextInt(6)%2;
		
		if(sorteio == 0) {

			do {
				if (Combatente1.vivo() == true) {
					int Dano = calcularDano();
					System.out.println(Combatente1.nome + " Seu ataque é " + Dano + " ao " + Combatente2.nome);
					System.out.println("Vida atual do "+ Combatente2.nome + ": " + Combatente2.ReceberDano(Dano));
					
				}
	
				if (Combatente2.vivo() == true) {
					int Dano = calcularDano();
					System.out.println(Combatente2.nome + " Seu ataque é " + Dano + " ao " + Combatente1.nome);
					System.out.println("Vida atual do  "+ Combatente1.nome + ": " + Combatente1.ReceberDano(Dano));
					
				};
			}

			while(Combatente1.vivo() == true && Combatente2.vivo() == true);
	
			} else {
				do {
					if (Combatente2.vivo() == true) {
						int Dano = calcularDano();
						System.out.println(Combatente2.nome + " Seu ataque é " + Dano + " ao " + Combatente1.nome);
						System.out.println("Vida atual do "+ Combatente1.nome + ": " + Combatente1.ReceberDano(Dano));

					};
			
					if (Combatente1.vivo() == true) {
						int Dano = calcularDano();
						System.out.println(Combatente1.nome + " Seu ataque é " + Dano + " ao " + Combatente2.nome);
						System.out.println("Vida atual do "+ Combatente2.nome + ": " + Combatente2.ReceberDano(Dano));
				
					}
				}
	
				while(Combatente1.vivo() == true && Combatente2.vivo() == true);
			}

			if (Combatente1.vivo() == true) {
				return ("O Vencedor é : " + Combatente1.nome);
			} else {
				return ("O Vencedor é : " + Combatente2.nome);
			}
		}
}

