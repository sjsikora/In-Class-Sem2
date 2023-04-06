package L3;

public class L3_Shapes {
    public static void main(String[] args) {

        // Rectangle r = new Shape(); // The class has to be a subtype of the reference type
        // Circle c = new Shape(); // ersror

    }
    static void print(Shape s) {
        System.out.println("Shape");
    }
    static void print(Circle s) {
        System.out.println("Shape");
    }
    static class Shape {
        public Shape() {
        }
    }
    static class Circle extends Shape {
        public Circle() {
        }
    }
    static class Rectangle extends Shape {
        public Rectangle() {
        }
    }

}