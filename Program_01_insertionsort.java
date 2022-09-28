public class Program_01_insertionsort {
    public static void Insertionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    
    
        int[] arr = {1,10,2,20,5};
        int key;
        for(int j=2;j<arr.length;j++){
            key = arr[j];
            int i = j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1]=key;
        }
        Insertionsort(arr);
    }
}

