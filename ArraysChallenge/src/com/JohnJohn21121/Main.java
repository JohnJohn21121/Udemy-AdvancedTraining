package com.JohnJohn21121;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    int[] myArray=getIntegers(5);
    int[] sorted = sortArrays(myArray);
    printArray(sorted);
    }

    public static int[] getIntegers(int numbersAvailable){
    int[] array = new int[numbersAvailable];
        System.out.println("Enter " + numbersAvailable + " Numbers please.\r");
        for (int i=0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("The element " + i + " value is " + array[i]);
        }
    }

    public static int[] sortArrays(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i=0; i<array.length;i++){
            sortedArray[i]= array[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag=false;
            for (int i=0;i<sortedArray.length-1;i++){
                if (sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
