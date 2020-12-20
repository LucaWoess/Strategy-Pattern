
public class Client {

	public static void main(String[] args) {
		Drug augentropfen = new Drug();
		System.out.println("Augentropfen werden mit "+augentropfen.tax()+"% versteuert.");
		
		ImportOfArt monaLisa = new ImportOfArt();
		System.out.println("Der Import von Mona Lisa wird mit "+monaLisa.tax()+"% versteuert.");
		
		LuxuryFood schokolade = new LuxuryFood();
		System.out.println("Schokolade wird mit "+schokolade.tax()+"% versteuert.");
		
		CircusVisit fünfAHWII = new CircusVisit();
		System.out.println("Der Besuch im Zirkus 5AHWII wird mit "+fünfAHWII.tax()+"% versteuert.");
	}
}
