package ie.tudublin;

import java.lang.reflect.Array;
import java.util.ArrayList;

import processing.core.PApplet;

public class Word extends PApplet {
    
    private String word;

    ArrayList<Follow>follow = new ArrayList<Follow>();


    //getters and setters for the array list
    public ArrayList<Follow> getFollow() {
        return follow;
    }

    public void setFollow(ArrayList<Follow> follow) {
        this.follow = follow;
    }

    //Constructors for the array list
    public Word(ArrayList<Follow> follow) {
        this.follow = follow;
    }

    //to string for the array list 
    @Override
    public String toString() {
        return "Word [follow=" + follow + "]";
    }

    
    



















}
