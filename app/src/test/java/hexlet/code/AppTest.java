package hexlet.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testStringScheme() throws Exception {

        var v = new Validator();
        var schema = v.string();

        assertTrue(schema.isValid(null), "Expected valid for null");
        schema.required();
        assertFalse(schema.isValid(null), "Expected not valid for null");
        assertFalse(schema.isValid(""), "Expected not valid for empty");

        assertTrue(schema.isValid("what does the fox say"), "Expected valid for string");
        assertTrue(schema.isValid("hexlet"), "Expected valid for string");

        assertTrue(schema.contains("wh").isValid("what does the fox say"), "Expected valid for string contains wf");
        assertTrue(schema.contains("what").isValid("what does the fox say"), "Expected valid for string contains what");
        assertFalse(schema.contains("whatthe").isValid("what does the fox say"), "Exp notvalid for contains whatthe");

        var schema1 = v.string();
        assertEquals(false, schema1.minLength(10).isValid("Hexlet"), "Expected notvalid for minlen 10");
        assertEquals(true, schema1.minLength(10).minLength(4).isValid("Hexlet"), "Expected valid for string minlen");
    }

}
