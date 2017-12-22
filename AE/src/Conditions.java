import java.io.Serializable;

// si on veut deux conditions il faut faire un appel récursif
// ex cond(a&b) => cond(cond(a)==true & cond(b)==true)
@SuppressWarnings("serial")
public class Conditions implements Serializable {
	public static enum symbole{égal, différent, inférieur, supérieur, strictinférieur, strictsupérieur }
	Variable v1;
	symbole s;
	Variable v2;
	public Conditions(Variable va, symbole symbole, Variable vb) {
		v1=va;
		s=symbole;
		v2=vb;
	}
	public Conditions(Variable va, symbole symbole, int n) {
		v1=va;
		s=symbole;
		v2= new Variable(Integer.toString(n));
	}
	public String toString() {
		switch(s) {
		case égal:
			return(v1+"=="+v2);
		case différent:
			return(v1+"!="+v2);
		case supérieur:
			return(v1+">="+v2);
		case inférieur:
			return(v1+"<="+v2);
		case strictsupérieur:
			return(v1+">"+v2);
		case strictinférieur:
			return(v1+"<"+v2);
		default :
			return("");
		}
	}

}
