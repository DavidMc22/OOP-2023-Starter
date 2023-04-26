package ie.tudublin;

import processing.core.PApplet;

public class Follow extends PApplet{
    
    private String word;
    private int count;


    //Getter and setters
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    //Constructor
    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }

    //Tostring
    @Override
    public String toString() {
        return "Follow [word=" + word + ", count=" + count + "]";
    }

    


    

}
