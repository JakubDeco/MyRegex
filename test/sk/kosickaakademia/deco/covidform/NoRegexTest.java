package sk.kosickaakademia.deco.covidform;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoRegexTest {
    private NoRegex object;

    @BeforeEach
    void setUp() {
        object=new NoRegex();
    }

    @Test
    void isOPValid() {
        assertTrue(object.isOPValid("aa123456"));
        assertTrue(object.isOPValid("aB123456   "));
        assertTrue(object.isOPValid("ZB129456"));
        assertTrue(object.isOPValid("  ZB129456 "));

        assertFalse(object.isOPValid("ZB129"));
        assertFalse(object.isOPValid(""));
        assertFalse(object.isOPValid(null));
        assertFalse(object.isOPValid("1256asdk"));
    }
}