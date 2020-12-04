package com.example.restservice.service;

import javax.annotation.PostConstruct;
import java.util.Hashtable;
import java.util.Map;

public class RomanNumeralService {

    Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
    Hashtable<Character,Integer> ht2 = new Hashtable<Character,Integer>();

    @PostConstruct
    public void init() {
        {
            ht.put(1, "I");
            ht.put(10, "X");
            ht.put(100, "C");
            ht.put(1000, "M");

            ht.put(5, "V");
            ht.put(50, "L");
            ht.put(500, "D");


            ht2.put('I', 1);
            ht2.put('X', 10);
            ht2.put('C', 100);
            ht2.put('M', 1000);

            ht2.put('V', 5);
            ht2.put('L', 50);
            ht2.put('D', 500);
        }
    }

    public String convertToRomanNumeral(Integer number) {
        //Validate integer no decimal
        //Validate 1 to 3999

        StringBuilder romanNumeral = new StringBuilder();

        while (number >= 1000) {
            romanNumeral.append("M");
            number -= 1000;
        }

        //previous base ten minus following base ten
        while (number >= 900) {
            romanNumeral.append("CM");
            number -= 900;
        }

        while (number >= 500) {
            romanNumeral.append("D");
            number -= 500;
        }

        //previous base five minus following base ten
        while (number >= 400) {
            romanNumeral.append("CD");
            number -= 500;
        }

        while (number >= 100) {
            romanNumeral.append("C");
            number -= 100;
        }

        //previous base ten minus following base ten
        while (number >= 90) {
            romanNumeral.append("XC");
            number -= 90;
        }

        while (number >= 50) {
            romanNumeral.append("L");
            number -= 50;
        }

        //previous base five minus following base ten
        while (number >= 40) {
            romanNumeral.append("XL");
            number -= 40;
        }

        while (number >= 10) {
            romanNumeral.append("X");
            number -= 10;
        }

        //previous base ten minus following base ten
        while (number >= 9) {
            romanNumeral.append("IX");
            number -= 9;
        }

        while (number >= 5) {
            romanNumeral.append("V");
            number -= 5;
        }

        //previous base five minus following base ten
        while (number >= 4) {
            romanNumeral.append("IV");
            number -= 4;
        }

        while (number < 10 && number > 0) {
            romanNumeral.append("I");
            number -= 1;
        }


        return romanNumeral.toString();
    }


    public int convertToInteger(String number) {
        //Validate integer no decimal
        //Validate 1 to 3999

        int i = 0;
        int prev = 0;
        for(int index = 0; index<number.length(); index++)
        {
            char temp = number.charAt(number.length()-index-1);
            for(Map.Entry<Integer, String> e : ht.entrySet())
            {
                if(e.getValue().equals(temp+""))
                {
                    int tempNum = e.getKey();
                    if(prev > tempNum)
                    {
                        i-=tempNum;
                    }
                    else
                        i+=tempNum;
                    break;
                }
            }
        }
        return i;
    }

    //TODO: add post endpoint to resful controller
}
