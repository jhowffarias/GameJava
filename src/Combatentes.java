
public class Combatentes {

	String nome;
	int ataque; 
	int defesa;
	int HP = 100;
	boolean vivo;
	
	public Combatentes(String nome, int ataque, int defesa, int HP) {
		this.nome = nome;
		this.ataque = ataque; 
		this.defesa = defesa;
		this.HP = HP;
}
	public int ReceberDano (int Dano) {
		HP -= Dano;
		return HP;
	}
	
	public int AtacarOponente (int Ataque) {
		HP += Ataque;
		return HP;
	}
	
	public int HPAtual () {
		return HP;
	}
	
	public boolean vivo () {
		if (HPAtual() > 0) {
			return true;
		} else {
			return false;
		}
	}
	
}
