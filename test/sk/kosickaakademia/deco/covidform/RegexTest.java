package sk.kosickaakademia.deco.covidform;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexTest {
    private Regex object;

    @BeforeEach
    void setUp() {
        object=new Regex();
    }

    @Test
    void isOPValid() {
        assertTrue(object.isOPValid("aa123456"));
        assertTrue(object.isOPValid("aB123456   "));
        assertTrue(object.isOPValid("ZB129456"));
        assertTrue(object.isOPValid("  ZB129456 "));

        assertFalse(object.isOPValid("ZB129"));
        assertFalse(object.isOPValid(""));
        assertFalse(object.isOPValid(" "));
        assertFalse(object.isOPValid(null));
        assertFalse(object.isOPValid("1256asdk"));
    }

    @Test
    void isSPZValid() {
        assertTrue(object.isSPZValid("ab1M3Ka"));
        assertTrue(object.isSPZValid("ab123ka  "));
        assertTrue(object.isSPZValid(" ab12345  "));
        assertTrue(object.isSPZValid(" ABeztox  "));
        assertTrue(object.isSPZValid(" abezto9  "));
        assertTrue(object.isSPZValid("ab1zto9  "));
        assertTrue(object.isSPZValid("ab1zto9"));

        assertFalse(object.isSPZValid("1b1zto9"));
        assertFalse(object.isSPZValid(""));
        assertFalse(object.isSPZValid("1"));
        assertFalse(object.isSPZValid("A"));
        assertFalse(object.isSPZValid("ak123o"));
        assertFalse(object.isSPZValid("a9123oz"));
        assertFalse(object.isSPZValid(null));
    }
}