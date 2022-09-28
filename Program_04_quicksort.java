import java.util.Arrays;

public class Program_04_quicksort{
    
    public static int partition(int[] arr,int p,int r){
        int pivot = arr[r];
        int i=p-1;
        for(int j=p;j<r;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[r] = temp;
        return i;
    }
    public static void Quicksort(int[] arr,int p,int r){
        
        if(p<r){
            int q=partition(arr,p,r);
            Quicksort(arr, p, q-1);
            Quicksort(arr, q+1, r);
        }
    }
  
    public static void main(String[] args) {
        int[] arr = {54,26,93,17,77,31,44,55};
        int n = arr.length;

        Quicksort(arr, 0, n-1);
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        System.out.println("Sorted array is:");
        System.out.println(Arrays.toString(arr));
    }
}