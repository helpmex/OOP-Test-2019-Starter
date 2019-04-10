package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}
	Table table;
	public void loadColours() {
		table = loadColours("colours.csv", "header");
		
		println(table.getRowCount() + "total rows in table" );
		
		for (TableRow row : table.rows()) {
			
			String colour = row.getString("colour");
			int r = row.getInt("r");
			int g = row.getInt("g");
			int b = row.getInt("b");
			int value = row.getInt("value");
		}
	}
	
	public void printColours() {
		printColours.loadColours();
		println(colour + " has an r value of " + r " and a green value of " + g " and a blue value of " + b " and value of " + value );
	}
	
	public Color findColor(int value) {
		int val = 0;
		val <=11;
		if(value equals value ) {
			println("%d the value is equal to the colour %s" value, colour );
		}
	}
	

	public void setup() 
	{
	}
	
	public void draw()
	{			
	}
	
	   private ArrayList<Colour> colours = new ArrayList<Colour>();
	   private ArrayList<Resistor> resistors = new ArrayList<Resistor>();
}
