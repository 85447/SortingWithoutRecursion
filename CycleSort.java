import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int arr[] ={3,5,2,1,4};
        CycleSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void CycleSort(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        for(int i = 0; i < arr.length; i++){
           int temp = arr[a];
           arr[a] = arr[b];
           arr[b] = temp;
        }
    }
}
