public class Main{

public static void main(String[] args) {

    try{
    
    Square zeroSquare = new Square(0);

    } catch(InvalidGeometricalDimensionException IGE){
        System.out.println("Exception caught: " + IGE.getMessage());

    }


    try{

        Circle zeroCircle = new Circle(0);


    } catch(InvalidGeometricalDimensionException IGE){
        System.out.println("Exception caught: " + IGE.getMessage());
    }






Triangle niceTriangle = new Triangle(3.0, 4.0, 5.0);

System.out.println(" Triangle Perimeter: " + niceTriangle.getPerimeter());

System.out.println("Triangle Area: " + niceTriangle.getArea());



}

}