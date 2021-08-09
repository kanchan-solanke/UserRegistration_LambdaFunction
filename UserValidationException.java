package Main;

public class UserValidationException extends IllegalArgumentException
{
    enum ExceptionType {INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_EMAIL, INVALID_MOBILE_NUMBER, INVALID_PASSWORD}
    ExceptionType type;

    public UserValidationException(ExceptionType type, String message){
        super(message);
        this.type = type;
    }
}