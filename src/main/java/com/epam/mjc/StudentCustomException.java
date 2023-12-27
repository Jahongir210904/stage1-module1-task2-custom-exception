package com.epam.mjc;

public class StudentCustomException extends IllegalArgumentException{
    public StudentCustomException(String message) {
        super("Could not find student with ID "+message);
    }
}
