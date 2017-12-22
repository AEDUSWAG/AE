@SuppressWarnings("serial")
public class Capteur extends Conditions {
	static final int seuil_Capteur = 100;
	public Capteur() {
		super(null, symbole.égal, null);
	}
	public String toString() {
		return("analogRead(capteur)>"+seuil_Capteur);
	}
}