@SuppressWarnings("serial")
public class Sommer extends Fonctions{
	Variable v1;
	Variable v2;
	public Sommer(Variable var1, Variable var2) {
		super(false);
		v1 = var1;
		v2 = var2;
	}
	public Sommer(Variable var, int n) {
		super(false);
		v1 = var;
		v2 = new Variable(Integer.toString(n));
	}
	public String toString() {
		return(v1+"+="+v2+";");
	}
}