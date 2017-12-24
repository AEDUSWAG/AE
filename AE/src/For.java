@SuppressWarnings("serial")
public class For extends Fonctions{
	Variable i;
	int d;
	int f;
	public For(Variable index, int début, int fin, int nb_boucle) {
		super(true, nb_boucle);
		i = index;
		d = début;
		f = fin;
	}
	public String toString() {
		return("for (int "+i+"="+d+"; "+i+" <= "+f+"; "+i+"++)");
	}
}