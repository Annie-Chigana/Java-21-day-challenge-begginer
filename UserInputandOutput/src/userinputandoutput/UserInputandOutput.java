package userinputandoutput;
import java.util.Scanner;
/**
 *
 * @author annie
 */
public class UserInputandOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creating a scanner object
        Scanner scanner = new Scanner(System.in);
        
        //Reading a text/string
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "!");
        
        
        //Reading a number/integer
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.println("You are " + age + " years old.");
        
         //Reading booleans
        System.out.println("Are you employed Yes/No");
        boolean isEmployed = scanner.nextBoolean();
        
        System.out.println("Employed: " + isEmployed);
        
        //Reading double/decimal number
        System.out.println("Enter your Salary: ");
        double salary = scanner.nextDouble();
        
        System.out.println("Your Salary is " + salary);
        
       
        
    }
    
}
