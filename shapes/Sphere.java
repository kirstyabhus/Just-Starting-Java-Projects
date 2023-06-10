package shapes;

public class Sphere extends Shape {
    // in feet
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    } 
    
    @Override
    public double area() {
        double area = 4 * 3.14 * (radius * radius);
        return area;
    }
}
