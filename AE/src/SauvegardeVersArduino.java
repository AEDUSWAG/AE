import java.io.*;
import java.util.LinkedList;

public class SauvegardeVersArduino {
	static void sauvegarder(LinkedList<Fonctions> fn) throws IOException {
		LinkedList<Integer> l = new LinkedList<Integer>();
		PrintWriter out = new PrintWriter("Arduino/Arduino.ino");
		FileOutputStream bin = new FileOutputStream("Arduino/Arduino.bin");
		ObjectOutputStream objOut = new ObjectOutputStream(bin);
		objOut.writeObject(fn);
		objOut.close();
		bin.close();
		out.println("int capteur = A0;");
		out.println("int fl = 11;");
		out.println("int bl = 10;");
		out.println("int fr = 9;");
		out.println("int br = 6;");
		out.println("void setup() {");
		//écrire ici les variables
		out.println("}");
		out.println("void loop() {");
		for (Fonctions f : fn) {
			if (f.bloc) {
				out.println(f+ " {");
				l.add(f.boucle);
			}
			else {
				out.println(f);
			}
			for (int i=0; i<l.size(); i++) {
				if (l.get(i)==0) {
					out.println("}");
					l.remove(i);
				}
				else {
					l.set(i, l.get(i)-1);
				}
				
			}
		}
		out.println("}");
		out.close();
	}
	

}
