package org.example;
@FunctionalInterface
interface lambdaValidationFun
{
    boolean matchPatternLambda(String input, String pattern);
}

public class UserValidationProcess
{
    lambdaValidationFun dd = (pattern, input) ->  pattern.matches(input);


    //for firstName validation
    public boolean validateFirstName(String name)
    {
        String firstnamepattern = "^([A-Z]{1})([a-z]{2,})$";
        return dd.matchPatternLambda(name,firstnamepattern);
    }

    //for lastName validation

    public boolean validateLastName(String name)
    {
        String lastnamepattern = "^([A-Z]{1})([a-z]{2,})$";
        return dd.matchPatternLambda(name,lastnamepattern);
    }


    //for Email validation
    public boolean validateEmail(String name)
    {
        String emailpattern =  "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$";
        return dd.matchPatternLambda(name,emailpattern);
    }

    //for Mobile No. validation
    public boolean validateMobileNumber(String name)
    {
        String mobilepattern =  "^([0-9]{2})[ ]([1-9]{1}[0-9]{9})$";
        return dd.matchPatternLambda(name,mobilepattern);
    }

    //for Password validation
    public boolean validatePassword(String name)
    {
        String pwdpattern = "^[a-zA-Z0-9]{8,}$";
        return dd.matchPatternLambda(name,pwdpattern);
    }


    public boolean passwordAtLeastOneUpperCase(java.lang.String name)
    {
        String pwdatleastoneuppercasepattern =  "^(.*[A-Z]{1}[A-Za-z0-9]{7,})$";
        return dd.matchPatternLambda(name,pwdatleastoneuppercasepattern);
    }

    public boolean validateAlteastOneNumber(java.lang.String name)
    {
        String atleastonenumberpattern = "^(.*[A-Z]{1,}[0-9]{1,}[A-Za-z0-9]{6,})$";
        return dd.matchPatternLambda(name,atleastonenumberpattern);
    }

    public boolean validateSpecialCharacter(java.lang.String name)
    {
        String specialcharacterpattern = "^(.*[A-Z]{1,}.*[0-9]{1,}.*[~!@#$%^&*]?[A-Za-z0-9]{5,})$";
        return dd.matchPatternLambda(name,specialcharacterpattern);
    }

    public String analyseMood(String message) {
        if (message.contains("SAD"))
            return "SAD";
        else
            return "Happy";
    }
}
