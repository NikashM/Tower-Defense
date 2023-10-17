import processing.core.PApplet;


import java.util.ArrayList;


public class Game extends PApplet {
    // TODO: declare game variables
    ArrayList<Tank> tanks;


    public void settings() {
        size(800, 800); // set the window size


    }


    public void setup() {
// TODO: initialize game variables
        tanks = new ArrayList<Tank>();




//int xSpeed, int ySpeed, int healthLevel, int xLocation, int yLocation
    }


    /***
     * Draws each frame to the screen. Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        background(255); // paint screen white
        fill(180);
        rect(0, 275, 800, 150);
        Tank tank = new Tank(3,10,335);
        tank.move(5);
        tank.draw(this);
// load green paint color


        for(Tank t : tanks) {
            t.draw(this);
        }






    }


    public static void main(String[] args) {
        PApplet.main("Game");
    }
}


