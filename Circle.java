
// the class circle implements shape for its abstract methods area and perimeter

public class Circle implements Shape{

    // private double parameter: radius
private double radius;

// circles constructor, will throw new exception if radius is less than or 
// equal to 0
public Circle(double radius){
    if(radius <= 0){
        // this exception is from the class InvalidGeometricalDimensionException
        // it extends to  IllegalArgumentException
        throw new InvalidGeometricalDimensionException();
    }
    // else the object radius equals radius

    this.radius = radius;

}

// this is how you calculate the area of a circle with the 
// abstract method Area().
// area of a circle: pi*r^2
public double getArea(){

    return Math.PI * radius * radius;

}

// to calculate the perimeter (abstract method from shape)
// 2*pi*r

public double getPerimeter(){

return 2 * Math.PI * radius;

}






}