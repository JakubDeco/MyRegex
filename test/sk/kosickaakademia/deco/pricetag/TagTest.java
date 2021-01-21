package sk.kosickaakademia.deco.pricetag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TagTest {


    @Test
    void isPriceTagValid() {
        Tag regex=new Tag();
        assertTrue(regex.isPriceTagValid("145"));
        assertTrue(regex.isPriceTagValid("0,14"));
        assertTrue(regex.isPriceTagValid("0"));
        assertTrue(regex.isPriceTagValid("1.15"));
        assertTrue(regex.isPriceTagValid("700000000000"));
        assertTrue(regex.isPriceTagValid("0.01"));
        assertTrue(regex.isPriceTagValid("20.08"));
        assertTrue(regex.isPriceTagValid("70.07"));
        assertTrue(regex.isPriceTagValid("19"));

        assertFalse(regex.isPriceTagValid(null));
        assertFalse(regex.isPriceTagValid(""));
        assertFalse(regex.isPriceTagValid("414,124"));
        assertFalse(regex.isPriceTagValid("0,00"));
        assertFalse(regex.isPriceTagValid("7,0"));
        assertFalse(regex.isPriceTagValid("009"));
        assertFalse(regex.isPriceTagValid("!2"));
        assertFalse(regex.isPriceTagValid("6, 08"));
        assertFalse(regex.isPriceTagValid("2..55"));
        assertFalse(regex.isPriceTagValid("02,45"));
        assertFalse(regex.isPriceTagValid("00"));
        assertFalse(regex.isPriceTagValid("7,00"));
        assertFalse(regex.isPriceTagValid("4,850"));
        assertFalse(regex.isPriceTagValid("2,2"));
        assertFalse(regex.isPriceTagValid("seven"));
        assertFalse(regex.isPriceTagValid("2.2.71"));
        assertFalse(regex.isPriceTagValid(","));
        assertFalse(regex.isPriceTagValid("0,0"));
        assertFalse(regex.isPriceTagValid(",45"));
        assertFalse(regex.isPriceTagValid("1   1,45"));
    }
}