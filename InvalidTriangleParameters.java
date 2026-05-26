
// this exception class is spesfically used for the triangle class

public class InvalidTriangleParameters extends IllegalArgumentException {
    
    // default constructor containing message
public InvalidTriangleParameters(){
    super("The triangle parameters should be more or equal to eachother");
}

// changing message from the class IllegalArgumentException 
// to fit the message in the default constructor
public InvalidTriangleParameters(String message){

super(message);

}


}
