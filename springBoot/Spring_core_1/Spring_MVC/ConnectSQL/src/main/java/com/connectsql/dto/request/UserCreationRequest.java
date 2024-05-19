package com.connectsql.dto.request;

import com.connectsql.exception.ErrorCode;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserCreationRequest {
    @Size(min = 3, message = "USERNAME_INVALID")
    private String userName;
    @Size(min = 8,message = "INVALID_PASSWORD")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;
}
