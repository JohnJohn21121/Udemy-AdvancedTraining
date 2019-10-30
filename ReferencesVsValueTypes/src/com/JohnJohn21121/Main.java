package com.JohnJohn21121;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int myIntValue = 10;
	int anotherIntValue = myIntValue;
        System.out.println("My int Value = " + myIntValue);
        System.out.println("The another Value is = " + anotherIntValue);
        anotherIntValue++;
        System.out.println("My int Value = " + myIntValue);
        System.out.println("The another Value is = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;
        System.out.println("My Int Array = " + Arrays.toString(myIntArray));
        System.out.println("Another array = " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;
        System.out.println("After Change My Int Array = " + Arrays.toString(myIntArray));
        System.out.println("After Change Another array = " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[] {5,4,6,7,8};
        modifyArray(myIntArray);
        System.out.println("After Modify My Int Array = " + Arrays.toString(myIntArray));
        System.out.println("After Modify Another array = " + Arrays.toString(anotherIntArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}
