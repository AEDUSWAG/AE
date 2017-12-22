import java.io.*;
import java.util.*;
@SuppressWarnings("unused")
public class Test {
	public static void main(String args []) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("Arduino/Arduino.ino");
		
		out.println("void setup() {");
		out.println("}");
		out.println("void loop() {\n re");
		out.println("}");
		out.close();
	}
}
