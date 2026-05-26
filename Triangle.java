
// the Triangle class implements shape
// it takes the abstract methods Area and Perimeter
public class Triangle implements Shape{

// this is techincally three double variables
// its double a, b, c
private double a, b, c;

// Triangle constructor
// it throws 2 exceptions instead of one
public Triangle(double a, double b, double c){

    // throws an InvalidGeometricalDimensionException if a, b, or c
    // equals 0
        if(a <= 0 || b <= 0 || c <= 0){
            throw new InvalidGeometricalDimensionException();
        }

        // throws an exception if a + b < c || a + c < b || b + c < a
        // throws the exception InvalidTriangleParameters
        if(a + b < c || a + c < b || b + c < a){
            throw new InvalidTriangleParameters();
        }

        // else the variables a, b, and c equal a, b, c

        this.a = a;
        this.b = b;
        this.c = c;

}

// to get the perimeter of a triangle its a + b + c

public double getPerimeter(){

    return a + b + c;

}


// to get the area:
// for a right triangle its a^2 + b^2 = c^2
// but this class does not gaurantee right triangles
// to get a normal triangles area its base (b) times height / 2
// hb/2
// but this class also does not gaurentee height
// so we use herons formula to get the area without height!
public double getArea(){
    // Heron's formula!!
    double s = getPerimeter() / 2;

    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}




}