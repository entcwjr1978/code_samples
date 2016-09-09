package com.lightcyclesoftware.character_count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.common.collect.Sets;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import static com.google.common.primitives.Chars.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapSentence("Hello there! Apple!");
    }

    private void mapSentence (String sentence) {
        LinkedHashSet<Character> alphabet = new LinkedHashSet<>(asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        LinkedHashMap<Character, Integer> characterMap = new LinkedHashMap<Character, Integer>();

        for (Character character : alphabet) {
            characterMap.put(character, 0);
        }

        for (int i = 0; i < sentence.length(); i++) {
            Character c = sentence.toLowerCase().charAt(i);
            if (alphabet.contains(c)) {
                characterMap.put(c, characterMap.get(c) + 1);
            }
        }

        Gson gson = new Gson();
        String json = gson.toJson(characterMap);
        System.out.println(json);
    }
}
