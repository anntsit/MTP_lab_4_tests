package lab_3_sort;

public class MergeSort implements Sortable {

    public void sort(int[] arr, int... border) {
        if (border[0] < border[1]) {
            // Find the middle point
            int middle = (border[0] + border[1]) / 2;

            // Sort first and second halves
            sort(arr, border[0], middle);
            sort(arr, middle + 1, border[1]);

            // Merge the sorted halves
            merge(arr, border[0], middle, border[1]);
        }
    }

    private void merge(int arr[], int lowerIndex, int middle, int higherIndex) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - lowerIndex + 1;
        int n2 = higherIndex - middle;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[lowerIndex + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[middle + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = lowerIndex;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    @Override
    public String toString() {
        return "Merge Sort";
    }
}