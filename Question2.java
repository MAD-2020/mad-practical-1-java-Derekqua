import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter height in m: "); //Prompt for height
    double height = in.nextDouble();
    
    System.out.print("Enter Weight in Kg: "); //Prompt for weight   
    double weight = in.nextDouble(); 
    
    double bmi = weight / (height * height); //Calculate bmi
    System.out.println("Your bmi is " + bmi);
  }
}
