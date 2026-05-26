public class Triangle extends Shape{


private double a, b, c;

public Triangle(double a, double b, double c){

        if(a <= 0 || b <= 0 || c <= 0){
            throw new InvalidGeometricalDimensionException();
        }

        this.a = a;
        this.b = b;
        this.c = c;

}


public double getPerimeter(){

    return a + b + c;

}

public double getArea(){
    // Heron's formula!!

    double s = getPerimeter() / 2;

    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}




}