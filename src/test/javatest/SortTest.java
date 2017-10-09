package javatest;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import lab_3_sort.*;

public class SortTest {
   private int [] expectedArray, actualArray;
   private Array mixedArray;

    @Before
    public void init() {
     mixedArray = new Array(150);
     actualArray = mixedArray.getArray();
     expectedArray = mixedArray.getArray();
    }

    @Test
    public void BubbleSort() {
    BubbleSort bubble = new BubbleSort();
    Arrays.sort(expectedArray);
    bubble.sort(actualArray);
    assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void CocktailSort() {
     CocktailSort cocktail=  new CocktailSort();
     Arrays.sort(expectedArray);
     cocktail.sort(actualArray);
     assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void CycleSort() {
     CycleSort cycle = new CycleSort();
     Arrays.sort(expectedArray);
     cycle.sort(actualArray);
     assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void InsertionSort() {
     InsertionSort insertion = new InsertionSort();
     Arrays.sort(expectedArray);
     insertion.sort(actualArray);
     assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void MergeSort() {
     MergeSort merge = new MergeSort();
     Arrays.sort(expectedArray);
     merge.sort(actualArray, 0, actualArray.length-1);
     assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void QuickSort() {
     QuickSort quick = new QuickSort();
     Arrays.sort(expectedArray);
     quick.sort(actualArray, 0, actualArray.length-1);
     assertArrayEquals(expectedArray, actualArray);
    }
}