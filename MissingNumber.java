public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println(MissingNumber(arr));
    }
     public static int MissingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] ;
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        //search for first missing number
         for(int index = 0; index < arr.length; index++){
             if(arr[index] != index){
                 return index;
             }
         }
         //case 2
         return arr.length;
     }
      static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
     }
}
