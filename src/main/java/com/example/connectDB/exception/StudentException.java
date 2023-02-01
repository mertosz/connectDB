package com.example.connectDB.exception;

public class StudentException extends BaseException
{
    public StudentException(String code)
    {
        super("student." + code);
    }

    public static StudentException requestNull()
    {
        return new StudentException("request.null");
    }

    public static StudentException stdNameNull()
    {
        return new StudentException("name.null");
    }

    public static StudentException stdEmailNull()
    {
        return new StudentException("email.null");
    }

    public static StudentException stdPhoneNull()
    {
        return new StudentException("phone.null");
    }
}

