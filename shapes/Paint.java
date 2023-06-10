package shapes;

public class Paint {
    // represent the number of square feet per gallon of paint
    // in this e.g. 6 sq feet is needed for 1 gallon of paint
    double coverage = 6;

    // returns the amount of paint (no. of gallons) needed to paint a given shape
    public double amount(Shape shape) {
        double amount = shape.area() / coverage;
        return amount;
        
    }
}
