@SuppressWarnings("serial")
public class While extends Fonctions{
	Conditions c;
	public While(Conditions condition, int nb_boucle) {
		super(true, nb_boucle);
		c = condition;
	}
	public String toString() {
		return("while ("+c+")");
	}
}