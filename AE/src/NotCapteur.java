@SuppressWarnings("serial")
public class NotCapteur extends Conditions {
	static final int seuil_Capteur = 100;
	public NotCapteur() {
		super(null, symbole.égal, null);
	}
	public String toString() {
		return("analogRead(capteur)<"+seuil_Capteur);
	}
}