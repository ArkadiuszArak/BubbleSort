package pl.com.bottega.commons.application;

import pl.com.bottega.commons.math.Sorter;

/**
 * Created by arkadiuszarak on 21/03/2016.
 */
public class BubbleSortTestConsoleApp {


    public static void main(String[] args) {

        String input = "100,120,46,1,3,999,1024,5";

        String[] stringArray = input.split(",");

        int[] result = new int[stringArray.length];

        for (int i = 0 ; i < stringArray.length ; i++){
            result[i] = Integer.parseInt(stringArray[i]);
        }

        Sorter testBuuble = new Sorter();
        testBuuble.sort(result);
        int[] sortResult = testBuuble.sort(result);
        testBuuble.sortInPlace(sortResult);
    }
}
