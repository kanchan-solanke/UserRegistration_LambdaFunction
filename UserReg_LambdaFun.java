import java.util.Scanner;
import java.util.regex.Pattern;

// Create Interface
@FunctionalInterface
interface UserIsValid {
    boolean mathPattern(String pattern, String name);
}

// class
public class UserReg_LambdaFun {
    static String firstnamePattern = "^[A-Z]{1}+[a-z]{3,}$";
    static String lastnamePattern = "^[A-Z]{1}+[a-z]{3,}$";

    // create an object of interface
    UserIsValid checkValid = (String pattern, String name) -> Pattern.matches(pattern, name);

    //method to check firstname is valid or not
    public void firstnameIsValid(String name) {
        if (checkValid.mathPattern(firstnamePattern, name)) {
            System.out.println("Name is Valid");
        } else {
            System.out.println("Please Enter a Valid First name: ");
        }
    }

    // method to check last name is valid or not
    public void lastnameIsValid(String name) {
        if (checkValid.mathPattern(lastnamePattern, name)) {
            System.out.println("Name is Valid");
        } else {
            System.out.println("Please Enter a Valid Last name: ");
        }
    }

    // main function
    public static void main(String[] args) {
        UserReg_LambdaFun lambda = new UserReg_LambdaFun();  //create an object
        Scanner sc = new Scanner(System.in);
        // For First Name
        System.out.println("Enter first name:");
        String fname = sc.nextLine();
        lambda.firstnameIsValid(fname);

        //For Last Name
        System.out.println("Enter last name:");
        String lname = sc.nextLine();
        lambda.lastnameIsValid(lname);
    }
}