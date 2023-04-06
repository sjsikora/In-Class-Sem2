package L4;

// An abstract class is a class that can not be instantiated. It is used as a base class for other classes.
public abstract class L4_Shape {
    private String color;
    private int x,y;

    public L4_Shape() {}


    public String getColor() {
        return this.color;
    }

    // This method can never be called, however, because it is in this class, any
    // var that holds a reference to this class can call it, because it is know.

    // The purpose of an abstract method is to inforce certain behavior for subclass,
    // yet, every class needs to be different
    
    public abstract double getArea();

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}