package ru.iFellow;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(SquareNotFoundException.class)
  public ResponseEntity<String> handleResourceNotFoundException(SquareNotFoundException error) {
    return new ResponseEntity<>(error.getMessage(), HttpStatus.NOT_FOUND);
  }

}