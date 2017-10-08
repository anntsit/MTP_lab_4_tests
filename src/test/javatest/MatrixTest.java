package javatest;

import lab_2_array.Matrix;
import org.junit.*;

import static org.junit.Assert.*;

public class MatrixTest {

    static int[][] matrix;
    static Matrix customMatrix;

    @BeforeClass
    public static void init(){
        matrix = new int[][]{{1, 2, 3}, {-5, 8, -9}, {-100, 17, 26}};
        customMatrix = new Matrix(matrix);
    }

    @Test
    public void FindColon(){
        int customColon = customMatrix.FindColon();
        int actualColon = 2; //0
        assertEquals(customColon, actualColon);
    }

    @Test
    public void FindMinimumElement(){
        int customElement = customMatrix.FindMinimumElement(0);
        int actualElement = -100;
        assertEquals(customElement, actualElement);
    }

    @Test
    public void FindFirstPositiveItem(){
        int[] customPosotives = customMatrix.FindFirstPositiveItem();
        int[] actualPosotives = {1, 8, 17};
        assertArrayEquals(customPosotives, actualPosotives);
    }

    @Test
    public void FindMinimumToDiagonal(){
        int[] customElements = customMatrix.FindMinimumToDiagonal();
        int[] actualElements = {1, -5, -100};
        assertArrayEquals(customElements, actualElements);
    }
}
