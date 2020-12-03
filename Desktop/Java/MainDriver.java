import java.util.*;

public class MainDriver{

public static void main(String[]args){

SortingAlgorithm myArray = new SortingAlgorithm();

      int[] array = {5,4,3,2,1};
      int[] array2 = Arrays.copyOf(array,array.length);
      System.out.print("UNCHANGED:\n");
      int[]fBubbleSort =  myArray.BubbleSort(array2); 
      int[]fSelectionSort = myArray.SelectionSort(array2);
      int[]fInsertionSort = myArray.InsertionSort(array2);
      int[]fCountingSort = myArray.CountingSort(array2);
      System.out.print("\nCHANGED: ");
      System.out.print("\nBUBBLE SORT:" );
      System.out.print(Arrays.toString(fBubbleSort));
      System.out.print("\nSELECTION SORT:"); 
      System.out.print(Arrays.toString(fSelectionSort));
      System.out.print("\nINSERTION SORT:" );
      System.out.print(Arrays.toString(fInsertionSort));
      System.out.print("\nCOUNTING SORT:" );
      System.out.print(Arrays.toString(fCountingSort));
      System.out.print("\nAfter Sorting:");
      System.out.print(Arrays.toString(array));


}
}