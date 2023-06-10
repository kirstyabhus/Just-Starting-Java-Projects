package shapes;

public class Rectangle extends Shape {
    // in feet
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    } 

    @Override
    public double area() {
        double area = length * width;
        return area;
    }
}
