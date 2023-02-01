package com.example.butchershop.creator;

import com.example.butchershop.Entity.User;

import java.math.BigDecimal;

public class UserCreator {
    public static final String USERNAME = "Test";
    public static final String PASSWORD = "longpassword123";
    public static final String FIRST_NAME = "Test";
    public static final String LAST_NAME = "Test";
    public static final int AGE = 23;
    public static final String EMAIL = "randomemail@gmail.test";
    public static final String GENDER = "Male";
    public static final BigDecimal BALANCE = new BigDecimal(1000);
    public static final String CITY = "Warsaw";

    public static User createTestUser() {
        User testObject = new User();

        testObject.setUsername(USERNAME);
        testObject.setPassword(PASSWORD);
        testObject.setPasswordConfirm(PASSWORD);
        testObject.setFirstName(FIRST_NAME);
        testObject.setLastName(LAST_NAME);
        testObject.setEmail(EMAIL);
        testObject.setBalance(BALANCE);
        testObject.setCity(CITY);

        return testObject;
    }
}
