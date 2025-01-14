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
        
        //Reading double/decimal number
        System.out.println("Enter your price: ");
        double price = scanner.nextDouble();
        
        System.out.println("The price is " + price);
        
        //Reading booleans
        System.out.println("Are you active True/False");
        boolean isActive = scanner.nextBoolean();
        
        System.out.println("Active" + isActive);
        
        
    }
    
}
