
// this class extends to the object class IllegalArgumentException
// this class is used to throw an exception if a shapes perimeters (side, radius, a b or c ) = 0
public class InvalidGeometricalDimensionException extends IllegalArgumentException {



// default constructor for error message
public InvalidGeometricalDimensionException(){

super("Geometrical shape should be greater than zero");


}

// another constructor creating the super into a message
// this is customising message to include the message made in default constructor
// it should print "Geometrical shape should be greater than zero"
public InvalidGeometricalDimensionException(String message){

super(message);

}



}