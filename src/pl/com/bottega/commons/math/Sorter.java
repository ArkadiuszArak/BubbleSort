package pl.com.bottega.commons.math;

/**
 * Created by arkadiuszarak on 21/03/2016.
 */
public class Sorter {

    public int[] sort(int[] number){

        int[] result = new int[number.length];

        for (int i = 0, j = 0; i < number.length; i++, j++) {
            result[j] = number[i];
        }
        bubbleSort(result);

        for (int n = 0 ; n < result.length ; n++){
            System.out.println(result[n]);
        }

        return result;
    }

    public void sortInPlace(int[] number){
        bubbleSort(number);
    }

    private void bubbleSort(int[] data4Sort){
        int thirdCup = 0;
        int length = data4Sort.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (data4Sort[j - 1] > data4Sort[j]) {
                    thirdCup = data4Sort[j - 1];
                    data4Sort[j - 1] = data4Sort[j];
                    data4Sort[j] = thirdCup;
                }
            }
        }
    }
}
