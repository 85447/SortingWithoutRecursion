import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Allduplicatenumber {
    public static void main(String[] args) {
        int arr[] ={4,3,2,7,8,2,3,1};
        List<Integer> duplicates = Duplicate(arr);
        System.out.println(duplicates);
    }
    public static List<Integer> Duplicate(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();

        for(int j = 0; j < arr.length;j++){
            if(arr[j] != j+1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int a, int b){
        for(int i = 0; i < arr.length; i++){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
