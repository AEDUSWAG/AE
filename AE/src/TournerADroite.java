@SuppressWarnings("serial")
public class TournerADroite extends Fonctions{
	int d;
	public TournerADroite(int durée) {
		super(false);
		d=durée;
	}
	public String toString() {
		return("analogWrite(fr, 0);\nanalogWrite(bl, 0);\ndelay("+s+");\nanalogWrite(fl, 255);\nanalogWrite(br, 255);\ndelay("+d+");\nanalogWrite(fr, 0);\nanalogWrite(fl, 0);\nanalogWrite(br, 0);\nanalogWrite(bl, 0);");
	}
}