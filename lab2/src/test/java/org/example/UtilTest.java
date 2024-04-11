package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {
    @Test
    public void whenNumberIsNotCorectThenException() {
        assertThrows(IllegalArgumentException.class,()->{
            Util.convertRomanToArabic("_I_V");
        });
        assertThrows(IllegalArgumentException.class,()->{
            Util.convertRomanToArabic("_V");
        });
        assertThrows(IllegalArgumentException.class,()->{
            Util.convertRomanToArabic("IIIII");
        });
        assertThrows(IllegalArgumentException.class,()->{
            Util.convertRomanToArabic("0");
        });
    }
    @Test
    public void whenNumberIs_IThen_1() {
        assertEquals(1, Util.convertRomanToArabic("I"));
    }
    @Test
    public void whenNumberIs_IVThen_4() {
        assertEquals(4, Util.convertRomanToArabic("IV"));
    }
    @Test
    public void whenNumberIs_VThen_5() {
        assertEquals(5, Util.convertRomanToArabic("V"));
    }
    @Test
    public void whenNumberIs_IXThen_9() {
        assertEquals(9, Util.convertRomanToArabic("IX"));
    }
    @Test
    public void whenNumberIs_XThen_10() {
        assertEquals(10, Util.convertRomanToArabic("X"));
    }
    @Test
    public void whenNumberIs_XVIIThen_17() {
        assertEquals(17, Util.convertRomanToArabic("XVII"));
    }
    @Test
    public void whenNumberIs_XXIVThen_24() {
        assertEquals(24, Util.convertRomanToArabic("XXIV"));
    }
    @Test
    public void whenNumberIs_XXXIIThen_32() {
        assertEquals(32, Util.convertRomanToArabic("XXXII"));
    }
    @Test
    public void whenNumberIs_LXThen_40() {
        assertEquals(40, Util.convertRomanToArabic("XL"));
    }
    @Test
    public void whenNumberIs_XLVIIIThen_48() {
        assertEquals(48, Util.convertRomanToArabic("XLVIII"));
    }
    @Test
    public void whenNumberIs_LThen_50() {
        assertEquals(50, Util.convertRomanToArabic("L"));
    }
    @Test
    public void whenNumberIs_XVIIThen_57() {
        assertEquals(57, Util.convertRomanToArabic("LVII"));
    }
    @Test
    public void whenNumberIs_LXVThen_65() {
        assertEquals(65, Util.convertRomanToArabic("LXV"));
    }
    @Test
    public void whenNumberIs_LXXIIIThen_73() {
        assertEquals(73, Util.convertRomanToArabic("LXXIII"));
    }
    @Test
    public void whenNumberIs_LXXXIThen_81() {
        assertEquals(81, Util.convertRomanToArabic("LXXXI"));
    }
    @Test
    public void whenNumberIs_XCThen_I() {
        assertEquals(90, Util.convertRomanToArabic("XC"));
    }
    @Test
    public void whenNumberIs_XCIXThen_99() {
        assertEquals(99, Util.convertRomanToArabic("XCIX"));
    }
    @Test
    public void whenNumberIs_CThen_100() {
        assertEquals(100, Util.convertRomanToArabic("C"));
    }
    @Test
    public void whenNumberIs_CXXXIXThen_139() {
        assertEquals(139, Util.convertRomanToArabic("CXXXIX"));
    }
    @Test
    public void whenNumberIs_CCXLVThen_245() {
        assertEquals(245, Util.convertRomanToArabic("CCXLV"));
    }
    @Test
    public void whenNumberIs_CCCXXVIThen_326() {
        assertEquals(326, Util.convertRomanToArabic("CCCXXVI"));
    }
    @Test
    public void whenNumberIs_CDThen_400() {
        assertEquals(400, Util.convertRomanToArabic("CD"));
    }
    @Test
    public void whenNumberIs_CDLVIThen_456() {
        assertEquals(456, Util.convertRomanToArabic("CDLVI"));
    }
    @Test
    public void whenNumberIs_DThen_500() {
        assertEquals(500, Util.convertRomanToArabic("D"));
    }
    @Test
    public void whenNumberIs_DCLVIIThen_657() {
        assertEquals(657, Util.convertRomanToArabic("DCLVII"));
    }
    @Test
    public void whenNumberIs_DCCLXXXIXThen_789() {
        assertEquals(789, Util.convertRomanToArabic("DCCLXXXIX"));
    }
    @Test
    public void whenNumberIs_DCCCLXXIVThen_874() {
        assertEquals(874, Util.convertRomanToArabic("DCCCLXXIV"));
    }
    @Test
    public void whenNumberIs_CMThen_900() {
        assertEquals(900, Util.convertRomanToArabic("CM"));
    }
    @Test
    public void whenNumberIs_CMXCIXThen_999() {
        assertEquals(999, Util.convertRomanToArabic("CMXCIX"));
    }
    @Test
    public void whenNumberIs_MThen_1000() {
        assertEquals(1000, Util.convertRomanToArabic("M"));
    }
    @Test
    public void whenNumberIs_MCXIThen_1111() {
        assertEquals(1111, Util.convertRomanToArabic("MCXI"));
    }
    @Test
    public void whenNumberIs_MDXLVIIThen_1547() {
        assertEquals(1547, Util.convertRomanToArabic("MDXLVII"));
    }
    @Test
    public void whenNumberIs_MDCCCXCVIThen_1896() {
        assertEquals(1896, Util.convertRomanToArabic("MDCCCXCVI"));
    }
    @Test
    public void whenNumberIs_MMCCXXIIThen_2222() {
        assertEquals(2222, Util.convertRomanToArabic("MMCCXXII"));
    }
    @Test
    public void whenNumberIs_MMCDLXXXVThen_2485() {
        assertEquals(2485, Util.convertRomanToArabic("MMCDLXXXV"));
    }
    @Test
    public void whenNumberIs_MMCMLXXXVIIThen_2987() {
        assertEquals(2987, Util.convertRomanToArabic("MMCMLXXXVII"));
    }
    @Test
    public void whenNumberIs_MMMCCCXXXIIIThen_3333() {
        assertEquals(3333, Util.convertRomanToArabic("MMMCCCXXXIII"));
    }
    @Test
    public void whenNumberIs_MMMDCXCVIIIThen_3698() {
        assertEquals(3698, Util.convertRomanToArabic("MMMDCXCVIII"));
    }
    @Test
    public void whenNumberIs_MMMCMXCICThen_3999() {
        assertEquals(3999, Util.convertRomanToArabic("MMMCMXCIX"));
    }
}