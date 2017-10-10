package lab_2_array;

import java.util.Random;

public class Matrix {
    private  int [][] matrix;
    private  int dimension;

    public Matrix(int[][] matrix){
        this.matrix = matrix;
        dimension = matrix.length;
    }

    public Matrix(int dimension){
        this.dimension = dimension;
        matrix = new int [dimension][dimension];
        Random random = new Random();
        for (int i=0; i < dimension; i++){
            for (int j=0; j < dimension; j++){
                matrix[i][j] = random.nextInt();
                if(i==j) System.out.print((char) 27 + "[31m" + matrix[i][j]  + (char)27 + "[0m  ");
                else System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }
    }

    public int findColon(){
        int colon = 0;
        int finalSum = 0;
        int sum;
        for(int j=0; j<dimension; j++){
            sum = 0;
            for(int i=0; i<dimension; i++){
                if(matrix[i][j] <0 ){
                    int tmp = matrix[i][j]*(-1);
                    sum += tmp;
                }
                else sum+=matrix[i][j];
            }

            if(sum > finalSum) sum = finalSum;
            colon = j;
        }
        return colon;
    }

    public int findMinimumElement(int colon){
    int minimum = matrix[0][colon];
    for(int i=0; i< dimension; i++){
        if(matrix[i][colon]<minimum) minimum = matrix[i][colon];
    }
    return minimum;
    }

    public int[] findFirstPositiveItem(){
        int[] positive = new int[dimension];
        int count = 0;
        for(int i= 0; i<dimension;i++){
            for (int j=0; j<dimension; j++){
                if(matrix[i][j]>0){
                    positive[count] = matrix[i][j];
                    count++;
                    break;
                }
            }
        }
        return positive;
    }

    public int[] findMinimumToDiagonal(){
        int[] minimum = new int[dimension];
        for(int i=0; i<dimension;i++){
            minimum[i]=matrix[i][0];
            for (int j=0; j<=i; j++){
                if(matrix[i][j]<minimum[i]) minimum[i]=matrix[i][j];
            }
        }
        return minimum;
    }
}
