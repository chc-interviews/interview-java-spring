package com.example.restservice;

import com.example.restservice.service.RomanNumeralService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RomanNumeralTest {

    @Autowired
    private RomanNumeralService service;

    @org.junit.Test
    public void convertIntegerOne(){
        String result = service.convertToRomanNumeral(1);
        Assert.assertEquals("I", result);
    }

    @org.junit.Test
    public void convertUnderFour(){
        String result = service.convertToRomanNumeral(3);
        Assert.assertEquals("III", result);
    }

    @org.junit.Test
    public void convertFour(){
        String result = service.convertToRomanNumeral(4);
        Assert.assertEquals("IV", result);
    }

    @org.junit.Test
    public void convertFive(){
        String result = service.convertToRomanNumeral(5);
        Assert.assertEquals("V", result);
    }

    @org.junit.Test
    public void convertSix(){
        String result = service.convertToRomanNumeral(6);
        Assert.assertEquals("VI", result);
    }

    @org.junit.Test
    public void convertSeven(){
        String result = service.convertToRomanNumeral(7);
        Assert.assertEquals("VII", result);
    }

    @org.junit.Test
    public void convertNine(){
        String result = service.convertToRomanNumeral(9);
        Assert.assertEquals("IX", result);
    }

    @org.junit.Test
    public void convertNineteen(){
        String result = service.convertToRomanNumeral(19);
        Assert.assertEquals("XIX", result);
    }

    @org.junit.Test
    public void convertTen(){
        String result = service.convertToRomanNumeral(10);
        Assert.assertEquals("X", result);
    }

    @Test
    public void convertRandom(){
        String result = service.convertToRomanNumeral(853);
        Assert.assertEquals("DCCCLIII", result);
    }
}
