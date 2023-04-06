package L1;

public class Shape {
    private String color;
    private int x,y;

    public Shape() {
        this.color = "red";
    }

    public String getColor() {
        return this.color;
    }
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

    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", x='" + getX() + "'" +
            ", y='" + getY() + "'" +
            "}";
    }
}
