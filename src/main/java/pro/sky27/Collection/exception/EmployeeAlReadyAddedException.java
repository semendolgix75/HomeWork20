package pro.sky27.Collection.exception;

public class EmployeeAlReadyAddedException extends RuntimeException{
    public EmployeeAlReadyAddedException() {
    }

    public EmployeeAlReadyAddedException(String message) {
        super(message);
    }

    public EmployeeAlReadyAddedException(String message, Throwable cause) {
        super(message, cause);
    }
}
