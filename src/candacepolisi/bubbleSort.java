package candacepolisi;

public class bubbleSort {
    public static void bubbleSort(int[] arr) {
        System.out.print("Before: ");
        for(int a=0; a<arr.length;a++){
            System.out.print(arr[a]);
        }
        int temp;
        boolean swap=true;
        while(swap) {
            swap=false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] >= arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap=true;
                }
            }
        }
        System.out.print("    After: ");
        for(int a=0; a<arr.length;a++){
            System.out.print(arr[a]);
        }
    }

    public static int[] randArr(int c){
        int[] arr= new int[c];
        for (int x=0; x<arr.length;x++){
            arr[x]= (int)(Math.random()*10001);
        }
        return arr;
    }

    public static void checker(){
        long time= System.nanoTime();
        bubbleSort(randArr(4));
        time=System.nanoTime()-time;
        System.out.println("Time taken: " + time);
    }
}
