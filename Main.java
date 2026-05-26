public class Main{

    // main method
public static void main(String[] args) {

    // try
    try{
    // this should throw an exception cause the parameter side is equal to 0
    // it should throw the message we made in InvalidGeometricalDimensionException class
    Square zeroSquare = new Square(0);

    // catch 
    } catch(InvalidGeometricalDimensionException IGE){
        System.out.println("Exception caught: " + IGE.getMessage());

    }


    try{
        // this makes circles parameter -5
        // that means the parameter is less than 0
        // it should throw our error
        Circle negativeCircle = new Circle(-5);

        // this is the error message we made from 
        // InvalidGeometricalDimensionException class
    } catch(InvalidGeometricalDimensionException IGE){
        System.out.println("Exception caught: " + IGE.getMessage());
    }

    try{

        Triangle InvalidTriangle = new Triangle(3, 4, 9);
    }
    // made another exception for when a triangles parameters are invalid
    // the parameters when added up like a + b, should be more than or equal
    // to the last parameter. ie: a + b >= c
    // or a + c >= b
    // or b + c >= a
    catch(InvalidTriangleParameters ITP){
        System.out.println("Exception caught: " + ITP.getMessage());
    }


// the triangle class has 3 double parameters
// these are valid parameters cause 3 + 4 = 7
// a and b should be more than or equal to c

Triangle niceTriangle = new Triangle(3.0, 4.0, 5.0);
// prints the triangles perimeter to the console
System.out.println(" Triangle Perimeter: " + niceTriangle.getPerimeter());
// prints the triangles area to the console
System.out.println("Triangle Area: " + niceTriangle.getArea());



}

}