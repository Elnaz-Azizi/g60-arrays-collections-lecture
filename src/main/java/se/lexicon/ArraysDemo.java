package se.lexicon;

import java.util.Arrays;

public class ArraysDemo {
    static void main() {
        // int[] numbers;
        String[] names;

        // numbers = new int[3];// [0,0,0]

        String[] stringArray = new String[3];// [null, null, null]

        int[] numbersArr = new int[]{2, 4, 6, 8};

        int[] numbersArrInShortenedSyntax = {2, 4, 6, 8};

       /* System.out.println("Find Max Number");
        int[] numbers = {20, 66, 20, 14};
        int result = findMaxNumber(numbers);*/

        ex6();

    }

    public static void ex1() {
        String[] names = new String[3];
        System.out.println(names.length);
        names[0] = "John";
        names[names.length - 1] = "Jane";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        //System.out.println(names[3]);

    }

    public static void ex2() {
        int[] numbers = {5, 2, 3, 4, 7};
//Traditional For Loop:
        for (int i = 0; i < numbers.length; i++) {
            if (i == 2) {
                numbers[i] = 200;
            }
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Enhanced For Loop
        for (int number : numbers) {
            if (number == 5) number = 5000;
            System.out.println(number);
        }

        System.out.println("-------------------");
        for (int number : numbers) {
            System.out.println(number);
        }

    }

    public static void ex3() {
        int[] originalArray = {2, 5, 8, 1, 9};
        System.out.println("Original Array:");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] newArray = new int[originalArray.length + 1];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        newArray[newArray.length - 1] = 7;

        System.out.println("Expanded Array:");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();

    }


    public static int findMaxNumber(int[] numbers) { // {20,66,20,14}

        if (numbers.length == 0) throw new IllegalArgumentException("Array is empty");
        int maxNumber = numbers[0]; //66   66>20   20>66  14>66
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) maxNumber = numbers[i];
        }
        System.out.println("Maximum Number is : " + maxNumber);

        return maxNumber;


    }

    //Utility Methods
    public static void ex5() {
        // Arrays.sort()
        String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Marcus", "Martina"};
        System.out.println("Original Array:" + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted Array:" + Arrays.toString(names));
    }

    public static void ex6() {
        //Arrays.copyOf()
        int[] numbers = {2, 4, 6, 8};
        int[] newArray = Arrays.copyOf(numbers,numbers.length+1);
        newArray[newArray.length-1] = 50;
        System.out.println(Arrays.toString(newArray));
    }

}
