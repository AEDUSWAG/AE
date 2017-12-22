import java.io.*;
import java.util.LinkedList;

public class SauvegardeVersArduino {
	static void sauvegarder(LinkedList<Fonctions> fn) throws IOException {
		int i=0;
		LinkedList<String> l = new LinkedList<String>();
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
				l.add(i,f.toString()+" {");
				l.add(i+1, "}");
				i+=1;
			}
			else {
				l.add(i, f.toString());
				i+=1;
			}
		}
		for (String ln : l) {
			out.println(ln);
		}
		out.println("}");
		out.close();
	}
	

}
