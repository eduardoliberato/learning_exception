# learning_exception
In this code we use the concept of exception to make a program to work properly

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Java Exceptions



When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.

When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error).

--> Java try and catch

The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs:

Syntax

try {

  //  Block of code to try
  
}

catch(Exception e) {

  //  Block of code to handle errors
  
}


--> Finally

The finally statement lets you execute code, after try...catch, regardless of the result:

Syntax

try {

  //  Block of code to try
  
}

catch(Exception e) {

  //  Block of code to handle errors
  
}

finally {

//  Block of code 

}

--> The throw keyword

The throw statement allows you to create a custom error.

The throw statement is used together with an exception type.

Example
Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted":


public class Main {

  static void checkAge(int age) {
  
    if (age < 18) {
    
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
      
    }
    
    else {
    
      System.out.println("Access granted - You are old enough!");
      
    }
    
  }
  

Source: https://www.w3schools.com/java/java_try_catch.asp


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
