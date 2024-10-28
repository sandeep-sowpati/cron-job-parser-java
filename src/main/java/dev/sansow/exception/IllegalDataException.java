package dev.sansow.exception;

public class IllegalDataException extends Exception {
    public IllegalDataException() {
    }

    public IllegalDataException(String message) {
        super(message);
    }

    public IllegalDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalDataException(Throwable cause) {
        super(cause);
    }

    public IllegalDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
