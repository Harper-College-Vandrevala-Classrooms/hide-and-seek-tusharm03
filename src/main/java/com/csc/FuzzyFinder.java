package com.csc;

import java.util.ArrayList;

public class FuzzyFinder {

  // Linear search 
  public static int linearSearch(ArrayList<Fuzzy> fuzzies) {
    for (int i = 0; i < fuzzies.size(); i++) {
      if (fuzzies.get(i).color.equals("gold")) {
        return i; // Return index if found
      }
    }
    return -1; 
  }

  // Binary search function 
  public static int binarySearch(ArrayList<Fuzzy> fuzzies) {
    int left = 0;
    int right = fuzzies.size() - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      int comparison = fuzzies.get(mid).color.compareTo("gold");

      if (comparison == 0) {
        return mid; 
      } else if (comparison < 0) {
        left = mid + 1; // Search in the right half
      } else {
        right = mid - 1; // Search in the left half
      }
    }
    return -1; 
  }

}
