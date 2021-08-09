public class UserValidationProcess {

    //for firstName validation

    public boolean validateFirstName(String name) {
        String pattern = "^([A-Z]{1})([a-z]{2,})$";

        if (name.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }

    //for lastName validation

    public boolean validateLastName(String name) {
        String pattern = "^([A-Z]{1})([a-z]{2,})$";
        if (name.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }


    //for Email validation
    public boolean validateEmail(String name) {
        String pattern = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$";
        if (name.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }

    //for Mobile No. validation
    public boolean validateMobileNumber(String name) {
        String pattern = "^([0-9]{2})[ ]([1-9]{1}[0-9]{9})$";
        if (name.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }

    //for Password validation
    public boolean validatePassword(String name) {
        String pattern = "^[a-zA-Z0-9]{8,}$";
        if (name.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }

    public String analyseMood(String message) {
        if (message.contains("SAD"))
            return "SAD";
        else
            return "Happy";
    }
}