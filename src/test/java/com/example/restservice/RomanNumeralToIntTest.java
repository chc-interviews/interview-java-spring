package com.example.restservice;

import com.example.restservice.service.RomanNumeralService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RomanNumeralToIntTest {

    @Autowired
    private RomanNumeralService service;

    @Test
    public void convertIntegerOne(){
        int result = service.convertToInteger("I");
        Assert.assertEquals(1, result);
    }

    @Test
    public void convertUnderFour(){
        int result = service.convertToInteger("III");
        Assert.assertEquals(3, result);
    }

    @Test
    public void convertFour(){
        int result = service.convertToInteger("IV");
        Assert.assertEquals(4, result);
    }

    @Test
    public void convertFive(){
        int result = service.convertToInteger("V");
        Assert.assertEquals(5, result);
    }

    @Test
    public void convertSix(){
        int result = service.convertToInteger("VI");
        Assert.assertEquals(6, result);
    }

    @Test
    public void convertSeven(){
        int result = service.convertToInteger("VII");
        Assert.assertEquals(7, result);
    }

    @Test
    public void convertNine(){
        int result = service.convertToInteger("IX");
        Assert.assertEquals(9, result);
    }

    @Test
    public void convertNineteen(){
        int result = service.convertToInteger("XIX");
        Assert.assertEquals(19, result);
    }

    @Test
    public void convertTen(){
        int result = service.convertToInteger("X");
        Assert.assertEquals(10, result);
    }

    @Test
    public void convertRandom(){
        int result = service.convertToInteger("CMLXXXII");
        Assert.assertEquals(982, result);
    }

}
