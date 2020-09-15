import java.util.Scanner;  

/**
 *Will divide two numbers and provide a remainder 
 * @author Neil Fischer  
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
     Scanner input = new Scanner(System.in); 

    // Ask the user to input two numbers to divide 
    System.out.println("Please enter in two integers, on seperate lines, to divide.");

    //Take the first number 
    int X = input.nextInt(); 

    //Take the second number 
    int Y = input.nextInt(); 

    //divide the numbers  
    int A = X / Y; 

    // tell the user the answer 
    System.out.println(X + "/" + Y +  " is "  + A +  " with a remainder of " +  X%Y);

 


  }
}
