package pl.com.bottega.commons.math;

/**
 * Created by arkadiuszarak on 21/03/2016.
 */
public class Sorter {

    public static int[] sort(int[] number){
        int[] tmp = number.clone();
        return bubbleSort(tmp);
    }

    public static void sortInPlace(int[] number){
        bubbleSort(number);
    }

    private static int[] bubbleSort(int[] dataForSort){
        int thirdCup = 0;
        int length = dataForSort.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (dataForSort[j - 1] > dataForSort[j]) {
                    thirdCup = dataForSort[j - 1];
                    dataForSort[j - 1] = dataForSort[j];
                    dataForSort[j] = thirdCup;
                }
            }
        }
        return dataForSort;
    }
}
