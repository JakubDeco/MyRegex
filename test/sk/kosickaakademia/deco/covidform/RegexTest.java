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
    void isPhoneNumbValid() {
        assertTrue(object.isPhoneNumbValid(" +421915789456"));
        assertTrue(object.isPhoneNumbValid("00421915789456"));
        assertTrue(object.isPhoneNumbValid("0915789456 "));
        assertTrue(object.isPhoneNumbValid("  0915789456"));
        assertTrue(object.isPhoneNumbValid("  0915789456"));

        assertFalse(object.isPhoneNumbValid(" +421115789456"));
        assertFalse(object.isPhoneNumbValid(" +42111578kj56"));
        assertFalse(object.isPhoneNumbValid(" +00421915789456"));
        assertFalse(object.isPhoneNumbValid("091578945 "));
        assertFalse(object.isPhoneNumbValid(null));
        assertFalse(object.isPhoneNumbValid(""));
        assertFalse(object.isPhoneNumbValid(" "));
        assertFalse(object.isPhoneNumbValid(" 0907453"));
        assertFalse(object.isPhoneNumbValid(" 0907453a89"));
        assertFalse(object.isPhoneNumbValid(" 0907453*89"));
        assertFalse(object.isPhoneNumbValid(" 09074535646542158"));
    }
}