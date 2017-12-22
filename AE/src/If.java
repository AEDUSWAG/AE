@SuppressWarnings("serial")
public class If extends Fonctions{
	Conditions c;
	public If(Conditions condition) {
		super(true);
		c = condition;
	}
	public String toString() {
		return("if ("+c+")");
	}
}