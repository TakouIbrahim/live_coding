package com.example.convertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConvertRomanToArabicNumberTests {
    ConvertRomanToArabicNumber convert = new ConvertRomanToArabicNumber();

    @Test
    void shouldReturnRomanNumber1IfArabicNumberIsI() {
        Assertions.assertEquals(convert.convertInArabicNumber("I"), 1);

    }

    @Test
    void shouldReturnRomanNumber2IfArabicNumberIsII() {
        Assertions.assertEquals(convert.convertInArabicNumber("II"), 2);

    }
    @Test
    void shouldReturnRomanNumber15IfArabicNumberIsXV() {
        Assertions.assertEquals(convert.convertInArabicNumber("XV"), 15);

    }

    @Test
    void shouldReturnRomanNumber27IfArabicNumberIsXXVII() {
        Assertions.assertEquals(convert.convertInArabicNumber("XXVII"), 27);

    }

    @Test
    void shouldReturnRomanNumber59IfArabicNumberIsLIX() {
        Assertions.assertEquals(convert.convertInArabicNumber("LIX"), 59);

    }

    @Test
    void shouldReturnRomanNumber102IfArabicNumberIsCII() {
        Assertions.assertEquals(convert.convertInArabicNumber("CII"), 102);

    }

    @Test
    void shouldReturnRomanNumber359IfArabicNumberIsCCCLIX() {
        Assertions.assertEquals(convert.convertInArabicNumber("CCCLIX"), 359);

    }

    @Test
    void shouldReturnRomanNumber500IfArabicNumberIsD() {
        Assertions.assertEquals(convert.convertInArabicNumber("D"), 500);

    }

    @Test
    void shouldReturnRomanNumber1350IfArabicNumberIsMCCCL() {
        Assertions.assertEquals(convert.convertInArabicNumber("MCCCL"), 1350);

    }

    @Test
    void shouldReturnRomanNumber2916IfArabicNumberIsMMCMXVI() {
        Assertions.assertEquals(convert.convertInArabicNumber("MMCMXVI"), 2916);

    }

    @Test
    void shouldReturnRomanNumber2479IfArabicNumberIsMMCDLXXIX() {
        Assertions.assertEquals(convert.convertInArabicNumber("MMCDLXXIX"), 2479);

    }

    @Test
    void shouldReturnRomanNumber3512IfArabicNumberIsMMMDXII() {
        Assertions.assertEquals(convert.convertInArabicNumber("MMMDXII"), 3512);

    }

    @Test
    void shouldReturnRomanNumber3999IfArabicNumberIsMMMCMXCIX() {
        Assertions.assertEquals(convert.convertInArabicNumber("MMMCMXCIX"), 3999);

    }


}
