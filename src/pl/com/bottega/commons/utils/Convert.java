package pl.com.bottega.commons.utils;

/**
 * Created by arkadiuszarak on 24/03/2016.
 */
public class Convert {
    public static int[] convert(String[] input){

        int[] result = new int[input.length];
        for (int i = 0 ; i < input.length ; i++){
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }
}
