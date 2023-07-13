package com.example.convertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConvertionApplicationTests {
    ConvertArabicToRomanNumber convert = new ConvertArabicToRomanNumber();

    @Test
    void shouldReturnRomanNumberIIfArabicNumberIs1() {
        Assertions.assertEquals(convert.convertInRomanNumber(1), "I");

    }
    @Test
    void shouldReturnRomanNumberIIIIfArabicNumberIs3() {
        Assertions.assertEquals(convert.convertInRomanNumber(3), "III");

    }
    @Test
    void shouldReturnRomanNumberIVfArabicNumberIs4() {
        Assertions.assertEquals(convert.convertInRomanNumber(4), "IV");

    }
    @Test
    void shouldReturnRomanNumberVIIIfArabicNumberIs8() {
        Assertions.assertEquals(convert.convertInRomanNumber(8), "VIII");

    }
    @Test
    void shouldReturnRomanNumberXIfArabicNumberIs10() {
        Assertions.assertEquals(convert.convertInRomanNumber(10), "X");

    }
    @Test
    void shouldReturnRomanNumberXLIXIfArabicNumberIs49() {
        Assertions.assertEquals(convert.convertInRomanNumber(49), "XLIX");

    }
    @Test
    void shouldReturnRomanNumberLXIIfArabicNumberIs61() {
        Assertions.assertEquals(convert.convertInRomanNumber(61), "LXI");
    }

    @Test
    void shouldReturnRomanNumberCXXIIIIfArabicNumberIs123() {
        Assertions.assertEquals(convert.convertInRomanNumber(123), "CXXIII");
    }

    @Test
    void shouldReturnRomanNumberCCLXXIXIfArabicNumberIs279() {
        Assertions.assertEquals(convert.convertInRomanNumber(279), "CCLXXIX");
    }

    @Test
    void shouldReturnRomanNumberCDXLIXIfArabicNumberIs449() {
        Assertions.assertEquals(convert.convertInRomanNumber(449), "CDXLIX");
    }
    @Test
    void shouldReturnRomanNumberMDCCCXLVIfArabicNumberIs1845() {
        Assertions.assertEquals(convert.convertInRomanNumber(1845), "MDCCCXLV");
    }
    @Test
    void shouldReturnRomanNumberMCCCXXXIIIIfArabicNumberIs1333() {
        Assertions.assertEquals(convert.convertInRomanNumber(1333), "MCCCXXXIII");
    }
    @Test
    void shouldReturnRomanNumberMMCMIXIfArabicNumberIs2909() {
        Assertions.assertEquals(convert.convertInRomanNumber(2909), "MMCMIX");
    }
    @Test
    void shouldReturnRomanNumberMMCDLXXIXIfArabicNumberIs2479() {
        Assertions.assertEquals(convert.convertInRomanNumber(2479), "MMCDLXXIX");
    }
    @Test
    void shouldReturnRomanNumberMMMIIfArabicNumberIs3001() {
        Assertions.assertEquals(convert.convertInRomanNumber(3001), "MMMI");
    }
    @Test
    void shouldReturnRomanNumberMMMCMXCIXIfArabicNumberIs3999() {
        Assertions.assertEquals(convert.convertInRomanNumber(3999), "MMMCMXCIX");
    }


}
