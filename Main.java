import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {
  // create a method to store a number
  public static int firstDigit(int number){
    // see if the number can be divisible
    //method to get the first digit
    int remainder = 0;
    while(number < -10 || number > 10){
      remainder = number %10;
      number = number / 10;
    }
    return number;

  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // input a Scanner
    //using a method with the scanner
    Scanner input = new Scanner(System.in); 
    System.out.println("Please enter a integer");
    int number = input.nextInt(); 
    //calculate the first digit
    int remainder = firstDigit(number);
    System.out.println(remainder);
  }
}
