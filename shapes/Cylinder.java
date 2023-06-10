package shapes;

public class Cylinder extends Shape {
    // in feet
    double radius;
    double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    } 

    @Override
    public double area() {
        double area = height * 3.14 * (radius * radius);
        return area;
    }
    
}
