package com.api.guiloker.dto.request;

import javax.validation.constraints.*;
import java.time.LocalDate;

public class UsersRequestDto {

    @Email(message = "Please provide a valid email address")
    private String studentEmail;

    @Pattern(regexp = "\\d{8}", message = "GRR must be an 8-digit number")
    private String grr;

    @NotBlank(message = "Full name cannot be blank")
    private String fullName;

    @Past(message = "Birthdate must be in the past")
    private LocalDate birthdate;

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getGrr() {
        return grr;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}
