@SuppressWarnings("serial")
public class For extends Fonctions{
	Variable i;
	int d;
	int f;
	public For(Variable index, int début, int fin) {
		super(true);
		i = index;
		d = début;
		f = fin;
	}
	public String toString() {
		return("for (int "+i+"="+d+"; "+i+" <= "+f+"; "+i+"++)");
	}
}