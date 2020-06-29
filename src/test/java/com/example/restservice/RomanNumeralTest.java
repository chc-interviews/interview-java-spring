package com.example.restservice;

import com.example.restservice.service.RomanNumeralService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RomanNumeralTest {

    @Autowired
    private RomanNumeralService service;

    @Test
    public void convertIntegerOne(){
        String result = service.convertToRomanNumeral(1);
        Assert.assertEquals("I", result);
    }
}
