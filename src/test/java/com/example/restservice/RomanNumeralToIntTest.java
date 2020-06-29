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
        int result = service.convertToRomanNumeral("I");
        Assert.assertEquals(1, result);
    }

    @Test
    public void convertUnderFour(){
        int result = service.convertToRomanNumeral("III");
        Assert.assertEquals(3, result);
    }

    @Test
    public void convertFour(){
        int result = service.convertToRomanNumeral("IV");
        Assert.assertEquals(4, result);
    }

    @Test
    public void convertFive(){
        int result = service.convertToRomanNumeral("V");
        Assert.assertEquals(5, result);
    }

    @Test
    public void convertSix(){
        int result = service.convertToRomanNumeral("VI");
        Assert.assertEquals(6, result);
    }

    @Test
    public void convertSeven(){
        int result = service.convertToRomanNumeral("VII");
        Assert.assertEquals(7, result);
    }

    @Test
    public void convertNine(){
        int result = service.convertToRomanNumeral("IX");
        Assert.assertEquals(9, result);
    }

    @Test
    public void convertNineteen(){
        int result = service.convertToRomanNumeral("XIX");
        Assert.assertEquals(19, result);
    }

    @Test
    public void convertTen(){
        int result = service.convertToRomanNumeral("X");
        Assert.assertEquals(10, result);
    }

    @Test
    public void convertRandom(){
        int result = service.convertToRomanNumeral("CMLXXXII");
        Assert.assertEquals(982, result);
    }

}
