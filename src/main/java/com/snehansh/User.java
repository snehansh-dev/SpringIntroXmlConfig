package com.snehansh;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class User {
    private int userId;
    private String userFirstName;
    private String userLastName;
    private LocalDate userDateOfBirth;
    private Long userContactNumber;
    private String userEmailId;
    private String userAddress;
    private String userCity;

}
