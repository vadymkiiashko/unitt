package arrays;
import java.util.*;

public class arrayMinMax {
    int [] nums = {1,2,22,-23,65};
    public static int arrayMin(int[] array) {
        Arrays.sort(array);
        System.out.println("Minimum = " + array[0]);
        return array[0];
    }
    public static int arrayMax(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        System.out.println("Maximum= " + array[n]);
        return array[n];
}}
