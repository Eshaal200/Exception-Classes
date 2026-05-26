public class Square extends Shape{

private double side;


public Square(double side){

    if(side <= 0){
        throw new InvalidGeometricalDimensionException();
    }

    this.side = side;

}

public double getArea(){

    return side * side;

}

public double getPerimeter(){

return 4 * side;


}


}