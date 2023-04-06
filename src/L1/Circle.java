package L1;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        
        this.radius = radius;
    }
    
}