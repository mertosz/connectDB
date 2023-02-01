package com.example.connectDB.business;


import com.example.connectDB.exception.StudentException;
import com.example.connectDB.model.MregisterRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Objects;

@Service
public class StudentBusiness {
    public String register(@RequestBody MregisterRequest request) throws StudentException {
        if (request == null) {
            throw StudentException.requestNull();
        }


        if (Objects.isNull(request.getStdEmail()))
        {
            throw StudentException.stdEmailNull();
        }

        if (Objects.isNull(request.getStdName()))
        {
            throw StudentException.stdNameNull();
        }

        if (Objects.isNull(request.getStdPhone()))
        {
            throw StudentException.stdPhoneNull();
        }
            return "ss";
    }
}
