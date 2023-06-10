package shapes;

public abstract class Shape {
    String shapeName;

    public abstract double area();

    public String toString() {
        // will return the name of the class which is the name of the shape
        shapeName = this.getClass().getSimpleName();
        return shapeName;
    }
}
