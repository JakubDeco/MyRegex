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
    void isSPZValid() {
        assertTrue(object.isSPZValid("ab123ka  "));
        assertTrue(object.isSPZValid(" ab12345  "));
        assertTrue(object.isSPZValid(" ABeztox  "));
        assertTrue(object.isSPZValid(" abezto9  "));
        assertTrue(object.isSPZValid("ab1zto9  "));

        assertFalse(object.isSPZValid("1b1zto9"));
        assertFalse(object.isSPZValid(""));
        assertFalse(object.isSPZValid("1"));
        assertFalse(object.isSPZValid("A"));
        assertFalse(object.isSPZValid("ak123o"));
        assertFalse(object.isSPZValid("a9123oz"));
        assertFalse(object.isSPZValid(null));
    }
}