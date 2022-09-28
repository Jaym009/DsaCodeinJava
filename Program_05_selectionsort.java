import java.util.Arrays;

public class Program_05_selectionsort {
    void selectionsort(int[] arr){
        System.out.println("Sorted array in ascending order");
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {10,1,5,20,3};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_ele_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ele_index]){
                    min_ele_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_ele_index];
            arr[min_ele_index] = temp;
        }
        Program_05_selectionsort  cs = new Program_05_selectionsort();
        cs.selectionsort(arr);
    }
}
