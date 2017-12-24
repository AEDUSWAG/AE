@SuppressWarnings("serial")
public class Arreter extends Fonctions{
	public Arreter() {
		super(false);
	}
	public String toString() {
		return("analogWrite(fr, 0);\nanalogWrite(fl, 0);\nanalogWrite(br, 0);\nanalogWrite(bl, 0);");
	}
}