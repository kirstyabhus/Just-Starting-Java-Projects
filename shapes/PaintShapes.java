package shapes;

public class PaintShapes {

    public static void main(String[] args) {
        // create an instance (object) of the "Paint" class in order to access its non-static method (amount())
        // without creating an inistance of the "Paint class, you can't access its methods
        Paint paint = new Paint();

        // create objects
        Rectangle rectangleDeck = new Rectangle(35, 20);
        Sphere ball = new Sphere(15);
        Cylinder tank = new Cylinder(10,30);

        // calculate amount (in gallons) of paint for each shape
        double rectangleDeckArea = paint.amount(rectangleDeck);
        double ballArea = paint.amount(ball);
        double tankArea = paint.amount(tank);

        // calcualte total amount (gallons) of paint needed for all shapes
        double totalAmountOfPaint = rectangleDeckArea + ballArea + tankArea;
        System.out.println(totalAmountOfPaint + " gallons of paint is needed.");
    }

}
