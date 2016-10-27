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
   A class for producing simple greetings.
*/

public class Greeter
{
   /**
      Constructs a Greeter object that can greet a person or entity.
      @param aName the name of the person or entity who should be addressed in the greetings.
   */
   public Greeter(String aName)
   {
      name = aName;
   }

   /**
      Greet with a "Hello" message.
      @return a message containing "Hello" and the name of the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }
    
    private String name;
  
    /**
      Change the name of the Greeter object.
      @param newName the new name that the object gets 
      @return void.
   */
    public void setName(String newName)
    {
        name = newName;
    }
    
    /**
      Swap the name of the Greeter object with the name of the argument object.
      @param other the object whose name gets swapped into this Greeter's name.
      @return void.
   */
    public void swapNames(Greeter other){
        this.name = other.name;
    }
}
    
    