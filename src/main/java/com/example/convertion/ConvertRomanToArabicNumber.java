package com.example.convertion;

public class ConvertRomanToArabicNumber {
    private String[] romanSymboles = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    private int[] arabicSymboles = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };

    public Integer convertInArabicNumber(String inputRomanNumber) {

            Integer outputArabicNumber = 0;


            char[] romanArray = inputRomanNumber.toCharArray();
            for (int i = 0; i < romanArray.length; i++) {
                //int index = Arrays.ind
                int index = findIndex(String.valueOf(romanArray[i]));
                System.out.println(i);
                outputArabicNumber += arabicSymboles[index];
            }

            return outputArabicNumber;

    }
    public int findIndex(String romanSymbole){
        int index =0;
        for (int i = 0; i < romanSymboles.length; i++) {
            if (romanSymboles[i].equals(romanSymbole)) {
                index = i;
            }
        }
        return index;
    }

}


