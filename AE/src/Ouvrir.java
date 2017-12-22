import java.io.*;
import java.util.*;

public class Ouvrir {
	@SuppressWarnings("unchecked")
	static LinkedList<Fonctions> ouvrir() throws IOException, ClassNotFoundException {
		LinkedList<Fonctions> l;
		FileInputStream in = new FileInputStream("Arduino/Arduino.bin");
		ObjectInputStream objIn = new ObjectInputStream(in);
		l= (LinkedList<Fonctions>) objIn.readObject();
		objIn.close();
		in.close();
		return l;
	}
}
