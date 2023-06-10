# Shape
A class hierarchy of shapes and a program that computes the amount of paint needed to paint different objects. The hierarchy consists of a parent class Shape with three derived classes - Sphere, Rectangle, and Cylinder. The only attribute a shape will have is a name and a method that computes the area of the shape (surface area in the case of three-dimensional shapes).

The abstract class Shape has the following properties:
- an instance variable shapeName of type String
- an abstract method area()
- a toString method that returns the name of the shape

The concrete class Sphere has the following properties:
- it is a descendant of Shape
- it has a radius radius, and its area (surface area) is given by the formula (4 * 𝛑 * (radius2)).

The concrete class Rectangle has the following properties:
- it is a descendant of Shape
- it is defined by a length and a width, and its area is given by the formula (length * width).

The concrete class Cylinder has the following properties:
- it is a descendant of Shape
- it is defined by a radius radius and a height, and its area (surface area) is given by the formula (height * 𝛑 * (radius2)).

The class Paint has the following properties:
- an instance variable coverage of type Double, which represents the number of square feet per gallon of paint
- a method amount(Shape shape) which returns the amount of paint (number of gallons) needed to paint a given shape

The program PaintShapes computes the amount of paint needed to paint various shapes:
- a rectangle deck of length 35 and width 20
- a ball of radius 15
- and a tank of radius 10 and height 30

The PaintShapes program prints the overall amount of paint needed to the screen.
