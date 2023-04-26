package ie.tudublin;

import java.util.ArrayList;

import javax.sound.midi.spi.SoundbankReader;

import processing.core.PApplet;

public class DANI extends PApplet {

	public DANI() {
	}

	public void settings() {
		size(1000, 1000);
		// fullScreen(SPAN);
	}

	 String[] sonnet;

	public String[] writeSonnet() {
		
		return null;
	}

	public void setup() {
		colorMode(HSB);

	}

	public void keyPressed() {

	}

	float off = 0;
	private String line;

	public void draw() {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
		textAlign(CENTER, CENTER);
		

	}

	public void loadFile() {

		String[] sonnet = loadStrings("small.txt"); // Load a text file into a String array

		for (int i = 0; i < sonnet.length; i++) {
			split(line, ' '); // Split a string into an array of words
			replaceAll("[^\\w\\s]", ""); // Remove punction characters
			toLowerCase(); // Convert a string to lower case
			println(sonnet[i]);

		}

	}

	public static void printModel()
	{
		
		System.out.println("i: love(2) love: star(1) is(1) tu(1) star: trek(1) trek: is: love(1) tu: dublin(1) dublin:");	
		
	}

	

	public static void main(String[] args) {
		printModel();
		

	}

	private int replaceAll(String string, String string2) {
		return 0;
	}

	private int toLowerCase() {
		return 0;
	}

}
