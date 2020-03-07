
public class Combatentes {

	private String nome;
	private String habilidades;
	
	private double HP = 100;
	
	public Combatentes(String nome, String habilidades) {
		this.nome = nome;
		this.habilidades = habilidades; 
}
	public void ReceberDano (double HP) {
		this.HP -= Dano;
	}
	
	public void AtacarOponenete (double HP) {
		this.HP += Ataque;
	}
