package lab_2_array;

public class Array {
    private int[] array;

    public Array(int[] array){
        this.array=array;
    }

    public int findNumberOfPositive (){
        int number = 0;
        for(int i=0; i<array.length; i++){
           if (array[i]>0) number++;
        }
        return number;
    }

    public int sumOfElementsLargeThanThree (){
        int sum = 0;
        for (int i= 0; i<array.length; i++){
            if(array[i]>3) sum+=array[i];
        }
        return sum;
    }

    public int findMaximumElement (){
        int max = array[0];
        for (int i=0; i<array.length; i++){
            if(array[i]>max) max=array[i];
        }
        return max;
    }

    public int findNumberOfNegative (){
        int number = 0;
        for (int i=0; i<array.length; i++)
            if(array[i]<0) number++;
        return number;
    }

    public int findSumOfNegative (){
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]<0) sum +=array[i];
        }
        return sum;
    }

    public int findMinimumNumberDivisibleByFive () {
        int number = 0;
        for(int i = 0; i<array.length; i++)
            if(array[i]%5==0 && array[i]<number) number=array[i];
        return number;
    }
}
