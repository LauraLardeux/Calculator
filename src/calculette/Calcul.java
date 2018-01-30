package calculette;

public class Calcul {
	private int nb1;
	private int nb2;
	
	public Calcul(int nb1, int nb2) {
		this.nb1 = nb1;
		this.nb2= nb2;
	}
	
	public int addition() {
		return nb1 + nb2;
	}
	
	public static int addition(int a, int b) {
		return a+b;
	}
}
// une pour chaque type de calcul donc 4 débile 