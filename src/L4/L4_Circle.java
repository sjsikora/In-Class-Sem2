package L4;

public class L4_Circle extends L4_Shape {
    private double radius;


    //Because this class extends L4_Shape, it must implement the abstract method getArea()
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

}
