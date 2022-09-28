import java.util.Arrays;

public class Program_07_radixsort {
    void radixsort(int[] array,int size){
        int max = array[0];
        for(int i=1;i<size;i++){
            if(array[i]>max)
            max = array[i];
        }
        int place = 1;
        while(place <= max){
            countsort(array,place);
            place *= 10;
        }
    }
    void countsort(int[] array,int place){
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }
        for(int j=0;j<n;j++){
            count[array[j]/place % 10] += 1;
        }
        for(int i=1;i<10;i++){
            count[i] += count[i-1];
        }
        
        for(int j=n-1;j>=0;j--){
            int t = count[array[j]/place % 10];
            output[t-1] = array[j];
            count[array[j]/place % 10]--;
        }
        for(int i=0;i<n;i++){
            array[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] data = {121,432,564,23,1,45,788};
        int size = data.length;
        Program_07_radixsort rs = new Program_07_radixsort();
        rs.radixsort(data,size);
        System.out.println("Sorted Array in ascending order:");
        System.out.println(Arrays.toString(data));
    }
}
