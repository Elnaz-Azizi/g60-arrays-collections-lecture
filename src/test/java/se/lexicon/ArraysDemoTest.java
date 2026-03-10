package se.lexicon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArraysDemoTest {

    //Scenarios for testing maxNumber
    /*
    •	An array with only positive numbers.
•	An array with only negative numbers.
•	An array with both positive and negative numbers.
•	An array with duplicate values.
•	An array with a single element.
•	An empty array (should handle it gracefully or throw an exception).

     */
    @DisplayName( "Find the maximum number with positive numbers")
    @Test
    void findMaxNumberWithPositiveNumbers() { // (Arrange- Act - Assert)
        //1. Arrange
        int[] numbers = {2, 5, 3, 1};
        //2. Act call the method we want to test
        int actual = ArraysDemo.findMaxNumber(numbers);
        //3. Assert
        int expected = 5;
        assertEquals(expected, actual, "The maximum number should be 5");


    }

    @DisplayName("Find the maximum number with negative numbers")
    @Test
    void findMaxNumberWithNegativeNumbers() {
        // 1. Arrange
        int[] numbers = {-2, -5, -3, -1};
        // 2. Act
        int actual = ArraysDemo.findMaxNumber(numbers);
        // 3. Assert
        int expected = -1;
        assertEquals(expected, actual, "The maximum number should be -1");
    }
    @Test
    void findMaxNumberWithMixedNumbers() {
        int[] numbers = {-1, 5, 3, -9, 2};
        int expected = 5;
        int actual = ArraysDemo.findMaxNumber(numbers);
        assertEquals(expected, actual, "The maximum value should be 5");
    }

    @Test
    void findMaxNumberWithSingleElement() {
        int[] numbers = {42};
        int expected = 42;
        int actual = ArraysDemo.findMaxNumber(numbers);
        assertEquals(expected, actual, "The maximum value should be 42");
    }

    @Test
    void findMaxNumberWithEmptyArray() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> ArraysDemo.findMaxNumber(numbers), "Should throw IllegalArgumentException for empty array");
    }


}
