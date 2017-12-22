@SuppressWarnings("serial")
public class Avancer extends Fonctions{
	public Avancer() {
		super(false);
	}
	public String toString() {
		return("analogWrite(br, 0);\nanalogWrite(bl, 0);\ndelay("+s+");\nanalogWrite(fr, 255);\nanalogWrite(fl, 255);");
	}
}