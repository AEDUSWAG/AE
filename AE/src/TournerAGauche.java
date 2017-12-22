@SuppressWarnings("serial")
public class TournerAGauche extends Fonctions{
	int d;
	public TournerAGauche(int durée) {
		super(false);
		d=durée;
	}
	public String toString() {
		return("analogWrite(br, 0);\nanalogWrite(fl, 0);\ndelay("+s+");\nanalogWrite(fr, 255);\nanalogWrite(bl, 255);\ndelay("+d+");\nanalogWrite(fr, 0);\nanalogWrite(fl, 0);\nanalogWrite(br, 0);\nanalogWrite(bl, 0);");
	}
}