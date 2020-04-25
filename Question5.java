import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    int max = 0; //count highest mode
    int modevalue = 0; //value of mode
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of inputs: ");
    int noOfInputs = in.nextInt();

    int[] intArray = new int[noOfInputs]; //create array

    for (int i = 0; i < noOfInputs; i++) { //prompt to enter numbers
      System.out.printf("Enter a number (%d): ", i+1);
      intArray[i] = in.nextInt(); //insert numbers to array

      int count = 0;
      for (int j = 0; j<intArray.length; j++){

        if(intArray[j] == intArray[i]){
          count += 1; //if numbers are the same
        }

        if (count > max){
          max = count;
          modevalue = intArray[i];
        }
      }
    }
    System.out.print(modevalue); 
  }
}
