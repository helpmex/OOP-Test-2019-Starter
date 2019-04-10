
public class Resistor {
	
	public int value;
	public int ones;
	public int tens;
	public int hundreds;
	
	Resistor resistor = new Resistor();
	resistor.hundreds = (value / 100);
	resistor.tens = (value - (hundreds * 100)) / 10;
	resistor.ones = value - ((hundreds * 1--) + (tens * 10));
	resistor.print(hundreds + ",");
	resistor.print(tens + ",");
	resistor.println(ones);
}
