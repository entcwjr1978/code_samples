package com.lightcyclesoftware.alphabetstringencoder;


public class AlphabetStringEncoder {
    // there are two ways to do this, either a lookup table, or by directly calculating the correct character on-the-fly
    // AlphabetLookupHashMap contains a map that matches the character replacement algorithm
    // The other way to do it would be to create a method that uses the character position to calculate which character to use
    // For the sake of time, I'm implementing the lookup table

    public static String encodeString(String inputString) {
        StringBuilder result = new StringBuilder("");

        // Check for valid string first before encoding
        if (inputString == null) {
            return null;
        }

        for (char c : inputString.toCharArray()) {
            if (AlphabetLookupHashMap.map.containsKey(c)) {
                result.append(AlphabetLookupHashMap.map.get(c));
            } else {
                result.append(c);
            }
        }

        // Return null value if we are unable to encode the string
        return result.toString();
    }
}
