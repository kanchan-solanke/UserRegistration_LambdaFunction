import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserIsValid {
    boolean mathPattern(String pattern, String name);
}

public class UserReg_LambdaFun {
    static String namePattern = "^[A-Z]{1}+[a-z]{3,}$";
    static String lastPattern = "^[A-Z]{1}+[a-z]{3,}$";
    UserIsValid checkValid = (String pattern, String name) -> Pattern.matches(pattern, name);

    public void nameIsValid(String name){
            if (checkValid.mathPattern(namePattern, name)) {
                System.out.println("Name is Valid");
            } else {
                System.out.println("Please Enter a Valid First name: ");
            }
    }

    public void lastIsValid(String email){
        if(checkValid.mathPattern(lastPattern, email)) {
            System.out.println("Last name is Valid");
        }
        else {
            System.out.println("Please Enter a Valid last name:");
        }
    }
    public static void main(String[] args) {
        UserReg_LambdaFun lambda = new UserReg_LambdaFun();
        Scanner sc = new Scanner(System.in);
        // For First Name
        System.out.println("Enter first name:");
        String fname = sc.nextLine();
        lambda.nameIsValid(fname);

        // for Last Name
        System.out.println("Enter Last name");
        String lname = sc.nextLine();
        lambda.lastIsValid(lname);
    }
        }