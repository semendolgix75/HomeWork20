package pro.sky27.Collection.exception;

public class EmployeeNotFindException extends RuntimeException{
    public EmployeeNotFindException() {
    }

    public EmployeeNotFindException(String message) {
        super(message);
    }

    public EmployeeNotFindException(String message, Throwable cause) {
        super(message, cause);
    }
}
