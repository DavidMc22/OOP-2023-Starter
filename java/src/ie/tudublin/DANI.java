package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	public DANI() {
	}

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

	}

	float off = 0;
	private String line;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}


	public void loadFile()
	{

		String[] lines = loadStrings("small.txt"); // Load a text file into a String array
		
		for(int i = 0 ; i < lines.length; i++)
		{
			split(lines, ' '); // Split a string into an array of words
			replaceAll("[^\\w\\s]",""); // Remove punction characters
			toLowerCase(); // Convert a string to lower case 

		}
		
		
		
		
	
	}

	private int replaceAll(String string, String string2) {
		return 0;
	}

	private int toLowerCase() {
		return 0;
	}

	private int split(String[] lines, char c) {
		return 0;
	}

	

	










}
