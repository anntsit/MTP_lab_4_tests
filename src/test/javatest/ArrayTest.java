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
    public void FindNumberOfPositive(){
        int customNumber = customArray.FindNumberOfPositive();
        int actualNumber = 7;
        assertEquals(customNumber, actualNumber);
    }

    @Test
    public void SumOfElementsLargeThanThree(){
        int customNumber = customArray.SumOfElementsLargeThanThree();
        int actualSum = 30;
        assertEquals(customNumber, actualSum);
    }

    @Test
    public void FindMaximumElement(){
        int customNumber = customArray.FindMaximumElement();
        int actualMax = 9;
        assertEquals(customNumber, actualMax);
    }

    @Test
    public void FindNumberOfNegative(){
        int customNumber = customArray.FindNumberOfNegative();
        int actualNumber = 3;
        assertEquals(customNumber, actualNumber);
    }

    @Test
    public void FindSumOfNegative(){
        int customNumber = customArray.FindSumOfNegative();
        int actualSum = -24;
        assertEquals(customNumber, actualSum);
    }

    @Test
    public void FindMinimumNumberDivisibleByFive(){
        int customNumber = customArray.FindMinimumNumberDivisibleByFive();
        int actualNumber = -15;
        assertEquals(customNumber, actualNumber);
    }
}
