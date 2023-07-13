package com.example.convertion;

import java.util.HashMap;
import java.util.Map;

public class ConvertArabicToRomanNumber {
    private static String[] romanSymboles = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    private static int[] arabicSymboles = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };

    public static String convertInRomanNumber(int inputArabicNumber) {
        if (inputArabicNumber < 1 || inputArabicNumber > 3999) {
            return "Le nombre doit être compris entre 1 et 3999";
        }else{
            StringBuilder ouputRomanNumber = new StringBuilder();

            for (int i = 0; i < arabicSymboles.length; i++) {
                while (inputArabicNumber >= arabicSymboles[i]) {
                    ouputRomanNumber.append(romanSymboles[i]);
                    inputArabicNumber -= arabicSymboles[i];
                }
            }

            return ouputRomanNumber.toString();
        }
    }


}
