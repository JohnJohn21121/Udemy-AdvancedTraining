package com.JohnJohn21121;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the Numbers to Count : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] finalArray = readIntegers(count);
        int minResult = findMin(finalArray);
        System.out.println("The minimun Value is : " + minResult);
    }

    public static int[] readIntegers(int count){

        int[] arrayList = new int[count];
        for (int i = 0; i<arrayList.length;i++){
            System.out.println("Enter a Number :");
            int inputNumber = scanner.nextInt();
            scanner.nextLine();
            arrayList[i] =inputNumber;
        }
        return arrayList;
    }

    public static int findMin(int[] array){
    int min = Integer.MAX_VALUE;
    for (int i=0;i<array.length;i++){
        int arrayValue=array[i];
        if (arrayValue<min){
            min=arrayValue;
        }
    }
    return min;
    }
}


//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//        -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//        -Finally, print the minimum element in the array.
//
//        Tips:
//        -Assume that the user will only enter numbers, never letters
//        -For simplicity, create a Scanner as a static field to help with data input
//        -Create a new console project with the name eMinElementChallengef

