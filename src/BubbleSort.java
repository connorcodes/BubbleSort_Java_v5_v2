/*
Creator: Connor Sanders, Filippo, Jackson
Project: Project 1 - Version 5
Program: Descending Bubble Sort Algorithm
File: BubbleSort Class, contains bubble sort and print array methods
 */

public class BubbleSort {

    //Gets array and sorts the numbers
    public int[] DeBubSort(int[] inputArray) {
        int n = inputArray.length;
        int temp = 0;

        //Iterate sorting via "bubbling" larger numbers to the top
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (inputArray[j - 1] < inputArray[j]) {
                    temp = inputArray[j - 1];

                    //Setting values
                    inputArray[j-1] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        return inputArray;
    }

    //Prints the sorted array on the screen
    public void printArray(int[] inputArray){
        System.out.println("Here is your array after Bubble Sort!");
        //loop to iterate through and print all values inline
        for(int i=0; i < inputArray.length; i++){
            System.out.print(inputArray[i] + " ");
        }
    }


}
//END BubbleSort