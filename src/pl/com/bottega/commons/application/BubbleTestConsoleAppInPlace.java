package pl.com.bottega.commons.application;

import pl.com.bottega.commons.math.Sorter;
import pl.com.bottega.commons.utils.Convert;
import pl.com.bottega.commons.utils.Display;

/**
 * Created by arkadiuszarak on 23/03/2016.
 */
public class BubbleTestConsoleAppInPlace {
    public static void main(String[] args) {

        int[] numbers = Convert.convert(args);
        int[] sorted = Sorter.sort(numbers);
        Display.display(sorted);
        Display.display(numbers);

    }
}

