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
    static String emailPattern ="^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+[.]co(m|.in)$";
    static String mobilePattern ="^([0-9]{2}) ([1-9]{1}[0-9]{9})$";
    static String passwordPattern = "^[a-zA-Z0-9]{8,}$";
    static String password1Pattern ="^[A-Z]{1}[A-Za-z0-9]{7,}$";
    static String password2Pattern ="^[A-Z]{1}[0-9]{1,}+[A-Za-z0-9]{6,}$";
    static String password3Pattern ="^(.*[A-Z]{1,}.*[0-9]{1,}.*[~!@#$%^&*]?[A-Za-z0-9]{5,})$";

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

    // method to check email is valid or not
    public void emailIsValid(String email) {
        if (checkValid.mathPattern(emailPattern, email)) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Please Enter a Valid Email : ");
        }
    }

    // method to check Mobile Number is valid or not
    public void mobileIsValid(String mobilenum) {
        if (checkValid.mathPattern(mobilePattern, mobilenum)) {
            System.out.println("Mobile Number is Valid");
        } else {
            System.out.println("Please Enter a Valid Mobile Number: ");
        }
    }

    // method to check Password is valid or not
    public void passwordIsValid(String password) {
        if (checkValid.mathPattern(passwordPattern, password)) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Please Enter a Valid Password: ");
        }
    }

    // method to check Password is valid or not
    public void passwordatleastoneuppercaseIsValid(String password1) {
        if (checkValid.mathPattern(password1Pattern, password1)) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Please Enter a Valid Password: ");
        }
    }

    // method to check Password at least one numeric value is valid or not
    public void passwordatleastonenumericnumIsValid(String password2) {
        if (checkValid.mathPattern(password2Pattern, password2)) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Please Enter a Valid Password: ");
        }
    }

    // method to check Password at least one special character is valid or not
    public void passwordatleastonespecialcharacterIsValid(String password3) {
        if (checkValid.mathPattern(password3Pattern, password3)) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Please Enter a Valid Password: ");
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

        //For Email
        System.out.println("Enter Email :");
        String email = sc.nextLine();
        lambda.emailIsValid(email);

        //For Mobile Number
        System.out.println("Enter Mobile Number :");
        String mobilenum = sc.nextLine();
        lambda.mobileIsValid(mobilenum);

        //For Password
        System.out.println("Enter Password :");
        String password = sc.nextLine();
        lambda.passwordIsValid(password);

        //For Password At least One Upper Case
        System.out.println("Enter Password at least one upper case :");
        String password1 = sc.nextLine();
        lambda.passwordatleastoneuppercaseIsValid(password1);

        //For Password At least One Numeric Number in password
        System.out.println("Enter Password at least one numeric number :");
        String password2 = sc.nextLine();
        lambda.passwordatleastonenumericnumIsValid(password2);

        //For Password At least One special character in password
        System.out.println("Enter Password at least one special character :");
        String password3 = sc.nextLine();
        lambda.passwordatleastonespecialcharacterIsValid(password3);

    }

}