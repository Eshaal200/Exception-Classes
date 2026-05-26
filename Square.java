
// square implements shape for its abstract methods area and perimeter
public class Square implements Shape{
// private parameter for squares side(s).
private double side;

// constructor for square
// throws an exception if sqauares sides are less than or equal to 0
public Square(double side){

    if(side <= 0){
        // throws the exception InvalidGeometricalDimensionException
        throw new InvalidGeometricalDimensionException();
    }
    // else object side equals to side
    this.side = side;

}

// method used to calculate square (abstract method area)
// its side^2
public double getArea(){

    return side * side;
// or Math.sqrt(side, 2);
}

// this returns the perimeter of square
// perimeter: sides times 4
// (a square will always have 4 sides)
public double getPerimeter(){

return 4 * side;


}


}