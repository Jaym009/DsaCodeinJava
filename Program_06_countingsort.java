import java.util.Arrays;

public class Program_06_countingsort{
    void countsort(int[] array,int size){
        int[] output = new int[size + 1];
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
            max = array[i];
        }
        int[] count = new int[max + 1];
        for (int i = 0; i < max; i++) {
            count[i] = 0;
        }
        for (int j = 0; j < size; j++) {
            count[array[j]]++;
        }
        for (int i = 1; i <= max; i++) {
        count[i] += count[i - 1];
        }
        for (int j = size-1; j >= 0; j--) {
            int t = count[array[j]];
            output[t-1] = array[j];
            count[array[j]]--;
        }
 
        for (int i = 0; i < size; i++) {
        array[i] = output[i];
    }
  }
    
    public static void main(String[] args) {
        int[] data = { 4, 2, 2, 8, 3, 3, 1 };
        int size = data.length;
        // countsort(data,size);
        // System.out.println("Sorted Array in ascending order:");
        // for(int i=0;i<size;i++){
        //     System.out.print(data[i]+" ");
        // }
        // System.out.println();
        Program_06_countingsort cs = new Program_06_countingsort();
        cs.countsort(data, size);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}