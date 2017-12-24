import java.io.Serializable;

@SuppressWarnings("serial")
public class Fonctions implements Serializable{
	boolean bloc;
	int boucle;
	static final int s=200;
	public Fonctions(boolean b, int boucle) {
		bloc = b;
		this.boucle = boucle;
	}
	public Fonctions(boolean b) {
		bloc = b;
		boucle=0;
	}
	public String toString() {
		return("");
	}
	
}