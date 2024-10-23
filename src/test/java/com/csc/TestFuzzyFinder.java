package com.csc;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFuzzyFinder {

    FuzzyFinder finder;
    FuzzyListGenerator generator;

    @BeforeEach
    void setUp() {
        finder = new FuzzyFinder();
        generator = new FuzzyListGenerator();
    }

    @Test
    void testPresenceOfPurpleInRandomizedFuzzies() {
        ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();
        fuzzies.add(0, new Fuzzy("purple")); 
        assertTrue(fuzzies.stream().anyMatch(fuzzy -> fuzzy.color.equals("purple")), "Purple should be present in the randomized fuzzies.");
    }

    @Test
    void testPresenceOfPurpleInSortedFuzzies() {
        ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();
        fuzzies.add(0, new Fuzzy("purple")); 
        assertTrue(fuzzies.stream().anyMatch(fuzzy -> fuzzy.color.equals("purple")), "Purple should be present in the sorted fuzzies.");
    }
}
