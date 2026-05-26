public class InvalidGeometricalDimensionException extends IllegalArgumentException {



// default constructor for error message
public InvalidGeometricalDimensionException(){

super("Geometrical shape should be greater than zero");


}

// another constructor creating the super into a message
public InvalidGeometricalDimensionException(String message){

super(message);

}



}