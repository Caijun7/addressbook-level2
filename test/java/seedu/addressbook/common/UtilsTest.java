package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void isAnyNull() throws Exception {
        // empty list
        assertNoNull();

        // only one object
        assertContainsNull((Object) null);
        assertNoNull(1);
        assertNoNull("");
        assertNoNull("abc");

        // list contains null
        assertContainsNull("abc", "ab", "a", null);
        assertContainsNull(null, "a", "b", null);
        assertContainsNull(null, null);
        assertContainsNull(null, 1, new Integer(1));

        // list does not contains null
        assertNoNull("abc", "abc");
        assertNoNull("abc", "", "abc", "ABC");
        assertNoNull("", "abc", "a", "abc");
    }


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNoNull(Object... objects) {
        assertFalse(Utils.isAnyNull(objects));
    }

    private void assertContainsNull(Object... objects) {
        assertTrue(Utils.isAnyNull(objects));
    }
}
