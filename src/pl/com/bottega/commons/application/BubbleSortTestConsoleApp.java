package pl.com.bottega.commons.application;

import pl.com.bottega.commons.math.Sorter;
import pl.com.bottega.commons.utils.Convert;
import pl.com.bottega.commons.utils.Display;

/**
 * Created by arkadiuszarak on 21/03/2016.
 */
public class BubbleSortTestConsoleApp {


    public static void main(String[] args) {

        int[] numbers = Convert.convert(args);
        Display.display(numbers);
        Sorter.sortInPlace(numbers);
        Display.display(numbers);
    }
}
