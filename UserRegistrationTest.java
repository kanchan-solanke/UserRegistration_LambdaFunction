package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest
{
    UserValidationProcess userValidationProcess = new UserValidationProcess();

    //for firstName Validation
    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True()
    {
        boolean result = userValidationProcess.validateFirstName("Prajakta");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameInLowerCase_ShouldReturn_false()
    {
        boolean result = userValidationProcess.validateFirstName("kanchan");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameStartHaveMinThreeLetters_ShouldReturn_True()
    {
        boolean result = userValidationProcess.validateFirstName("Kan");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameStartWithLessThanThreeLetters_ShouldReturn_False()
    {
        boolean result = userValidationProcess.validateFirstName("Ka");
        Assertions.assertFalse(result);
    }

    //For lastName Validation
    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True()
    {
        boolean result = userValidationProcess.validateLastName("Solanke");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenLastNameInLowerCase_ShouldReturn_false()
    {
        boolean result = userValidationProcess.validateLastName("solanke");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenLastNameStartHaveMinThreeLetters_ShouldReturn_True()
    {
        boolean result = userValidationProcess.validateLastName("Kan");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenLastNameStartWithLessThanThreeLetters_ShouldReturn_False()
    {
        boolean result = userValidationProcess.validateLastName("Ka");
        Assertions.assertFalse(result);
    }


    //For Email Validation
    @Test
    public void givenEmail_WhenEmailContainMinimumTwoLetterAfterDot_ShouldReturn_True()
    {
        boolean result = userValidationProcess.validateEmail("abc@gmail.co");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenEmailContainOnlyOneLetterAfterDot_ShouldReturn_False()
    {
        boolean result = userValidationProcess.validateEmail("abc@gmail.c");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenEmail_WhenEmailStartsWithCapitalLetter_ShouldReturn_True()
    {
        boolean result = userValidationProcess.validateEmail("Kanchan@gmail.com");
        Assertions.assertTrue(result);
    }

    //for Mobile Number Validation

    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsFollowedByCountryCode_True()
    {
        boolean result = userValidationProcess.validateMobileNumber("91 8149240833");
        Assertions.assertTrue( result);
    }
    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNOtFollowedByCountryCode_False()
    {
        boolean result = userValidationProcess.validateMobileNumber("8149240833");
        Assertions.assertFalse( result);
    }
    @Test
    public void givenPhoneNumber_WhenPhoneNumberIsNOTTenDigit_False()
    {
        boolean result = userValidationProcess.validateMobileNumber("91 14924");
        Assertions.assertFalse( result);
    }
    @Test
    public void givenPhoneNumber_WhenPhoneNumberNOTFollowedSpaceBetweenCountryCode_False()
    {
        boolean result = userValidationProcess.validateMobileNumber("918149240833");
        Assertions.assertFalse(result);
    }

    //for Password Validation with minimum 8 character
    @Test
    public void givenPassword_WhenPasswordHaveMinimum8Characters_ShouldReturn_true()
    {
        boolean result = userValidationProcess.validatePassword("Kanchan14");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenPasswordHaveLessThan8Characters_ShouldReturn_false()
    {
        boolean result = userValidationProcess.validatePassword("gfbn");
        Assertions.assertFalse(result);
    }
    //for Password Validation with At least one uppercase
    @Test
    public void givenPassword_WhenPasswordHaveAtleast1UpperCase_ShouldReturn_true()
    {
        boolean result = userValidationProcess.passwordAtLeastOneUpperCase("Kanchan141996");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenPasswordDoNotHaveAtleast1UpperCase_ShouldReturn_false()
    {
        boolean result = userValidationProcess.passwordAtLeastOneUpperCase("kanchan141996");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenPasswordHaveAtleast1Digit_ShouldReturn_true()
    {
        boolean result = userValidationProcess.validateAlteastOneNumber("K14anch1996");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenPasswordDoNotHaveAnyDigit_ShouldReturn_false()
    {
        boolean result = userValidationProcess.validateAlteastOneNumber("Kanchan@");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenPasswordHaveAtleast1SpecialCharacter_ShouldReturn_true()
    {
        boolean result = userValidationProcess.validateSpecialCharacter("K1@anch12");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenPasswordDoNotHaveAnySpecialCharacter_ShouldReturn_false()
    {
        boolean result = userValidationProcess.validateSpecialCharacter("Kanchu1412");
        Assertions.assertFalse(result);
    }
    @Test
    public  void givenMessage_WhenNotSad_ShouldReturnHappy()
    {

        String mood = userValidationProcess.analyseMood("This is a Happy Message");
        Assertions.assertEquals("Happy", mood);

    }
}