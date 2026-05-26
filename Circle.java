public class Circle extends Shape{

private double radius;


public Circle(double radius){
    if(radius <= 0){
        throw new InvalidGeometricalDimensionException();
    }

    this.radius = radius;

}


public double getArea(){

    return Math.PI * radius * radius;

}



public double getPerimeter(){

return 2 * Math.PI * radius;

}






}