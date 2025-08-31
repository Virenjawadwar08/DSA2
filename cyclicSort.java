import java.util.*;

public class cyclicSort {

    static void sort(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]) {
                swap(arr,i,correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int first,int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// Dry Run (important!)

// Input: {3, 5, 2, 1, 4}

// i = 0, arr[0] = 3 → correct = 2
// arr[0] != arr[2] → swap(0, 2) → {2, 5, 3, 1, 4}

// i = 0, arr[0] = 2 → correct = 1
// arr[0] != arr[1] → swap(0, 1) → {5, 2, 3, 1, 4}

// i = 0, arr[0] = 5 → correct = 4
// arr[0] != arr[4] → swap(0, 4) → {4, 2, 3, 1, 5}

// i = 0, arr[0] = 4 → correct = 3
// arr[0] != arr[3] → swap(0, 3) → {1, 2, 3, 4, 5}

// i = 0, arr[0] = 1 → correct = 0
// arr[0] == arr[0] → i++

// Continue… array is already sorted.

// ✅ Final output: [1, 2, 3, 4, 5]

//O(n)-tc and O(1)-sc