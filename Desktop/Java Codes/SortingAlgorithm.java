import java.util.*;
public class SortingAlgorithm{

public int[] BubbleSort (int[] array){
        
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = false;
                }
                            }
            if(isSorted==true) break;
        }
        return array;
}
public int[] SelectionSort(int[] array){
            
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

       return array;

}
public int[]InsertionSort(int[] array){

        for (int i = 1; i < array.length; i++) {
            int boundery = i;
            int value_to_insert = array[i];
            while (boundery > 0 && value_to_insert < array[boundery - 1]) {
                array[boundery] = array[boundery - 1];
                boundery--;
            }
            array[boundery] = value_to_insert;
        }

        return array;
}
public int[] CountingSort(int[] array){
 
 int arrLength = array.length;
        if (arrLength == 0)
            return array;
        int max = array[0], min = array[0];
        for (int i = 1; i < arrLength; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        int range = max - min + 1;

        int[] count = new int[range];
        for (int i = 0; i < arrLength; i++){
            count[array[i] - min]++;}
        for (int i = 1; i < range; i++){
            count[i] += count[i - 1];}
        int j = 0;
        for (int i = 0; i < range; i++){
            while (j < count[i])
                array[j++] = i + min;
            }

         return array;          
}
}