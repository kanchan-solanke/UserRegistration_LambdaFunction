import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserValidationProcess userValidationProcess = new UserValidationProcess();
    private Assert Assertions;

    //for firstName Validation
    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True() {
        boolean result = userValidationProcess.validateFirstName("Kanchan");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameInLowerCase_ShouldReturn_false() {
        boolean result = userValidationProcess.validateFirstName("kanchan");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameStartHaveMinThreeLetters_ShouldReturn_True() {
        boolean result = userValidationProcess.validateFirstName("Kan");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameStartWithLessThanThreeLetters_ShouldReturn_False() {
        boolean result = userValidationProcess.validateFirstName("Ka");
        Assertions.assertFalse(result);
    }

    //For lastName Validation
    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True() {
        boolean result = userValidationProcess.validateLastName("Solanke");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLastNameInLowerCase_ShouldReturn_false() {
        boolean result = userValidationProcess.validateLastName("solanke");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenLastNameStartHaveMinThreeLetters_ShouldReturn_True() {
        boolean result = userValidationProcess.validateLastName("Sol");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLastNameStartWithLessThanThreeLetters_ShouldReturn_False() {
        boolean result = userValidationProcess.validateLastName("So");
        Assertions.assertFalse(result);
    }


    //For Email Validation
    @Test
    public void givenEmail_WhenEmailContainMinimumTwoLetterAfterDot_ShouldReturn_True() {
        boolean result = userValidationProcess.validateEmail("abc@gmail.co");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenEmailContainOnlyOneLetterAfterDot_ShouldReturn_False() {
        boolean result = userValidationProcess.validateEmail("abc@gmail.c");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenEmailStartsWithCapitalLetter_ShouldReturn_True() {
        boolean result = userValidationProcess.validateEmail("Kanchan@gmail.com");
        Assertions.assertTrue(result);
    }

    //for Mobile Number Validation

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_True() {
        boolean result = userValidationProcess.validateMobileNumber("91 8149240833");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNOtFollowedByCountryCode_False() {
        boolean result = userValidationProcess.validateMobileNumber("8149240833");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNOTTenDigit_False() {
        boolean result = userValidationProcess.validateMobileNumber("91 14924");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPhoneNumber_WhenPhoneNumberNOTFollowedSpaceBetweenCountryCode_False() {
        boolean result = userValidationProcess.validateMobileNumber("918149240833");
        Assertions.assertFalse(result);
    }

    //for Password Validation with minimum 8 character
    @Test
    public void givenPassword_WhenPasswordHaveMinimum8Characters_ShouldReturn_true() {
        boolean result = userValidationProcess.validatePassword("Kanchan14");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenPasswordHaveLessThan8Characters_ShouldReturn_false() {
        boolean result = userValidationProcess.validatePassword("gfbn");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        String mood = userValidationProcess.analyseMood("This is a Happy Message");
        Assertions.assertEquals("Happy", mood);

    }
}