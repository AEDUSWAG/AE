@SuppressWarnings("serial")
public class While extends Fonctions{
	Conditions c;
	public While(Conditions condition) {
		super(true);
		c = condition;
	}
	public String toString() {
		return("while ("+c+")");
	}
}