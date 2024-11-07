package histoires.personnages;

public class Humain {
	
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public void parler(String texte) {
		texte = this.nom + " - " + texte;
		System.out.println(texte);
	}
	
	public void direBonjour() {
		
	}
	
	public void boire() {
		
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	public String getBoisson() {
		return this.boisson;
	}
	
	public void gagnerArgent(int n) {
		
	}
	
	public void perdreArgent(int n) {
		
	}
	
}
