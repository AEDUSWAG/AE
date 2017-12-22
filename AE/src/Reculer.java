@SuppressWarnings("serial")
public class Reculer extends Fonctions{
	public Reculer() {
		super(false);
	}
	public String toString() {
		return("analogWrite(fr, 0);\nanalogWrite(fl, 0);\ndelay("+s+");\nanalogWrite(br, 255);\nanalogWrite(bl, 255);");
	}
}