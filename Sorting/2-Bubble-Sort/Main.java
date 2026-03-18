class BubbleSort{
    void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = n-1; i>=0; i--){
            for(int j= 0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
}

public class Main{
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.println("Before Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        BubbleSort sorter = new BubbleSort();
        sorter.bubbleSort(arr);

        System.out.println("After Using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}