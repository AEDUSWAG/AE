@SuppressWarnings("serial")
public class If extends Fonctions{
	Conditions c;
	public If(Conditions condition, int nb_boucle) {
		super(true, nb_boucle);
		c = condition;
	}
	public String toString() {
		return("if ("+c+")");
	}
}