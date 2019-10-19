/*
Creator: Connor Sanders, Filippo, Jackson
Project: Project 1 - Version 5
Program: Descending Bubble Sort Algorithm
File: Driver Class, contains main method and code to get array & send it to
BubbleSort
 */

import java.util.*;

public class Driver {

    public static void main(String[] args){

        //Scanners for input
        Scanner getI = new Scanner(System.in);
        Scanner getCont = new Scanner(System.in);
        //New BubbleSort object
        BubbleSort bubbly = new BubbleSort();

        //Get amount of numbers to sort
            System.out.println("How many numbers should I sort?");
            int numOfNums = getI.nextInt();

            //Preload array from input
            int[] bubbleArray = new int[numOfNums];

            //Add user given numbers to array via loop based on chosen size
            for (int i = 0; i < numOfNums; i++) {
                System.out.println("Enter number " + i + ": ");
                bubbleArray[i] = Integer.parseInt(getI.next());
            }

            //Send to sort method
            bubbly.DeBubSort(bubbleArray);

            //Print the sorted array
            bubbly.printArray(bubbleArray);
    }
}
//END Driver