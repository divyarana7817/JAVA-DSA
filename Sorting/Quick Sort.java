
class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1; //  Start from next to pivot
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }

            while (j >= low && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Final pivot swap
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
