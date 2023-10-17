public class Bullet {
    private double x, y;


    private double radius;
    private double xSpeed, ySpeed;
    private int damage;


    public Bullet(double x, double y){
        this.x = x;
        this.y = y;
//radius
//xspeed, yspeed
    }


    public void moveBullet() {
        x += xSpeed;
        y += ySpeed;
    }




}
