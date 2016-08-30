public class HelloHello
{
 public HelloHello(String aName)
 {
  name = aName;
 }

 public String sayHi()
 {
  return "Hi, hello, " + name + "!!"; 
 }
 private String name;
 
 public static void main (String[] args) {
  HelloHello hiGreeting = new HelloHello("everyone");
  String greet = hiGreeting.sayHi();
  System.out.println(greet);
 }
}