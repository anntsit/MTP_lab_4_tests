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
    public void findColon(){
        int customColon = customMatrix.findColon();
        int actualColon = 2; //0
        assertEquals(customColon, actualColon);
    }

    @Test
    public void findMinimumElement(){
        int customElement = customMatrix.findMinimumElement(0);
        int actualElement = -100;
        assertEquals(customElement, actualElement);
    }

    @Test
    public void findFirstPositiveItem(){
        int[] customPositives = customMatrix.findFirstPositiveItem();
        int[] actualPositives = {1, 8, 17};
        assertArrayEquals(customPositives, actualPositives);
    }

    @Test
    public void findMinimumToDiagonal(){
        int[] customElements = customMatrix.findMinimumToDiagonal();
        int[] actualElements = {1, -5, -100};
        assertArrayEquals(customElements, actualElements);
    }
}
