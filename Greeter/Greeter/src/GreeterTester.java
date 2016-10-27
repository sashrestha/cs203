/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashrestha
 */
/**
   A class for testing the Greeter class.
*/
public class GreeterTester
{
  /**
      Includes a main method to test the Greeter class. Creates a new instance of the Greeter class and prints out
      the greeting.
   */
   public static void main(String[] args)
   {
     /**
      Greet with a "Hello" message using the Greeter class with the argument "World"
      @print a message containing "Hello" and the argument passed to Greeter.
      */
      Greeter worldGreeter = new Greeter("World");
      String greeting = worldGreeter.sayHello();
      System.out.println(greeting);
      
      /**
      Create two variables pointing to the same Greeter object.
      Change the name of first Greeter object using the setName() method with 
      the argument "Earth", and invoke the sayHello() method on the second 
      Greeter object.
      */

      Greeter greet1 = new Greeter("duplicates");
      Greeter greet2 = greet1;

      greet1.setName("Earth");
      greet2.sayHello();
      
      /**
      Swap the name of a Greeter object using the swapNames() method with 
      the argument greet3.
      @print a message containing "Hello" and the original name of object
      greet1 and then with the swapped name.
      */

      Greeter greet3 = new Greeter("swapped");
      
      String originalName = greet1.sayHello();

      greet1.swapNames(greet3);
      
      String swappedName = greet1.sayHello();
      
      System.out.println("greet1 = " + originalName);
      System.out.println("greet1 = " + swappedName);
   }
}