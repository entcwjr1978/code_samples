package com.lightcyclesoftware.alphabetstringencoder;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {
    @Test
    public void null_input() throws Exception {
        String input = null;
        assert (AlphabetStringEncoder.encodeString(input) == null);
    }

    @Test
    public void emptyInput() throws Exception {
            String input = "";
            assert (AlphabetStringEncoder.encodeString(input).equals(""));
    }

    @Test
    public void all_lowercase() throws Exception {
        String input = "abcdefghijklmnopqrstuvwxyz";
        assert (AlphabetStringEncoder.encodeString(input).equals("zyxwvutsrqponmlkjihgfedcba"));
    }

    @Test
    public void all_uppercase() throws Exception {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        assert (AlphabetStringEncoder.encodeString(input).equals("ZYXWVUTSRQPONMLKJIHGFEDCBA"));
    }

    @Test
    public void mixed_case() throws Exception {
        String input = "AbCdEfGhIjKLMnoPqRsTuVwXyZ";
        assert (AlphabetStringEncoder.encodeString(input).equals("ZyXwVuTsRqPONmlKjIhGfEdCbA"));
    }

    @Test
    public void alphanumeric_case() throws Exception {
        String input = "0123456789AbCdEfGhIjKLMnoPqRsTuVwXyZ";
        assert (AlphabetStringEncoder.encodeString(input).equals("0123456789ZyXwVuTsRqPONmlKjIhGfEdCbA"));
    }

    @Test
    public void alphanumeric_with_special_characters() throws Exception {
        String input = "?-!0123456789AbCdEfGhIjKLMnoPqRsTuVwXyZ?-!";
        assert (AlphabetStringEncoder.encodeString(input).equals("?-!0123456789ZyXwVuTsRqPONmlKjIhGfEdCbA?-!"));
    }
}