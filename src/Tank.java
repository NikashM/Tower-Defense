import processing.core.PApplet;


import java.util.ArrayList;


public class Tank {
    private int xSpeed, ySpeed;
    private int healthLevel;
    private int xLocation;
    private int yLocation;
    private int width, height;




    public Tank( int healthLevel, int xLocation, int yLocation){
        this.xSpeed = 3;
        this.ySpeed = 0;
        this.healthLevel = healthLevel;
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.width = 5;
        this.height = 8;




    }
    public void draw(PApplet window){
        window.fill(255, 0, 0);
        window.ellipse(xLocation, yLocation, width, height);
    }


    public void move(int xSpeed){
        this.xLocation = xLocation + xSpeed;


    }
}
