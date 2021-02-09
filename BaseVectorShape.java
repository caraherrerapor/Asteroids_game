
 package Components;
 
 import java.awt.Shape;
 import java.util.Objects;

 
 


public class BaseVectorShape {
    // atributes_ variables
    private Shape shape;
    private boolean  alive;
    private  double x,y;
    private  double velx, vely;
    private double movAngle,faceAngle;
    
    //methods

    public Shape getShape() {
        return shape;
    }

    public boolean isAlive() {
        return alive;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVelx() {
        return velx;
    }

    public double getVely() {
        return vely;
    }

    public double getMovAngle() {
        return movAngle;
    }

    public double getFaceAngle() {
        return faceAngle;
    }
    
    // mutator

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setVelx(double velx) {
        this.velx = velx;
    }

    public void setVely(double vely) {
        this.vely = vely;
    }

    public void setMovAngle(double movAngle) {
        this.movAngle = movAngle;
    }

    public void setFaceAngle(double faceAngle) {
        this.faceAngle = faceAngle;
    }

    
    
    
    
    
}
