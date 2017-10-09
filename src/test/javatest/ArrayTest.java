package javatest;

import lab_2_array.Array;
import org.junit.*;

import static org.junit.Assert.*;

public class ArrayTest {

    static int[] array;
    static Array customArray;

    @BeforeClass
    public static void init(){
        array = new int[]{1, 2, 3, -4, -5, 6, 7, 8, 9, -15};
        customArray = new Array(array);
    }

    @Test
    public void findNumberOfPositive(){
        int customNumber = customArray.findNumberOfPositive();
        int actualNumber = 7;
        assertEquals(customNumber, actualNumber);
    }

    @Test
    public void sumOfElementsLargeThanThree(){
        int customNumber = customArray.sumOfElementsLargeThanThree();
        int actualSum = 30;
        assertEquals(customNumber, actualSum);
    }

    @Test
    public void findMaximumElement(){
        int customNumber = customArray.findMaximumElement();
        int actualMax = 9;
        assertEquals(customNumber, actualMax);
    }

    @Test
    public void findNumberOfNegative(){
        int customNumber = customArray.findNumberOfNegative();
        int actualNumber = 3;
        assertEquals(customNumber, actualNumber);
    }

    @Test
    public void findSumOfNegative(){
        int customNumber = customArray.findSumOfNegative();
        int actualSum = -24;
        assertEquals(customNumber, actualSum);
    }

    @Test
    public void findMinimumNumberDivisibleByFive(){
        int customNumber = customArray.findMinimumNumberDivisibleByFive();
        int actualNumber = -15;
        assertEquals(customNumber, actualNumber);
    }
}
