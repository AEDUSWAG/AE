@SuppressWarnings("serial")
public class Stop extends Fonctions{
	public Stop() {
		super(false);
	}
	public String toString() {
		return("set_sleep_mode(SLEEP_MODE_PWR_DOWN);\r\n" + 
				"cli();\r\n" + 
				"sleep_enable();\r\n" + 
				"sleep_bod_disable();\r\n" + 
				"sei();\r\n" + 
				"sleep_cpu();");
	}
}