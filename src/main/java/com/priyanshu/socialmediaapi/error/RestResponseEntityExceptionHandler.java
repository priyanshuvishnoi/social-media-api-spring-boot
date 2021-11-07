package com.priyanshu.socialmediaapi.error;

import com.priyanshu.socialmediaapi.models.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ErrorMessage> userAlreadyExistsException(UserAlreadyExistsException exception, WebRequest webRequest) {
        ErrorMessage errorMessage = new ErrorMessage(HttpStatus.CONFLICT, "User already exists!!!");

        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorMessage);
    }
}
