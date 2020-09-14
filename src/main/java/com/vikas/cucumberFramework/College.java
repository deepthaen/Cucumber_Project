package com.vikas.cucumberFramework;

public class College {
	
	// Declare a method with return type College class.
    College collegeName(){
    System.out.println("IIT-ISM is the best Engineering college in India.");
//Create an object of the class.
    College cg=new College(); // using first approach.
        return cg;
// return new College();
}
College estYear(){
System.out.println("IIT-ISM was established in 1926. ");
return this; // using 2nd approach.
}
public static void main(String[] args) {
// Create the object of the class.
    College c=new College();
    College cName=c.collegeName();
    System.out.println(cName);

    College eYear=c.estYear();
    System.out.println(eYear);
}

}
