package pl.com.bottega.commons.application;

import pl.com.bottega.commons.math.Sorter;

/**
 * Created by arkadiuszarak on 21/03/2016.
 */
public class BubbleSortTestConsoleAppInPlace {


    public static void main(String[] args) {

        int[] numbers = convert(args);
        Sorter.sortInPlace(numbers);
        display(numbers);
    }

    private static int[] convert(String[] input){

        int[] result = new int[input.length];
        for (int i = 0 ; i < input.length ; i++){
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }

    private static void display(int[] sortedTable){
        for (int i = 0 ; i < sortedTable.length ; i++){
            System.out.println(sortedTable[i]);
        }
    }

}
