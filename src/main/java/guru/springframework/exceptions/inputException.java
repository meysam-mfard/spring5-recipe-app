package guru.springframework.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class inputException extends IllegalArgumentException {
    public inputException() {
    }

    public inputException(String s) {
        super(s);
    }

    public inputException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
