package candacepolisi;

public class bubbleSort {

    public static void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static int[] bubbleSort(int[] arr) {
        boolean s=true;
        while (s){
            s=false;
            for(int a=0; a<arr.length-1;a++){
                if(arr[a]>arr[a+1]){
                    swap(arr,a,a+1);
                    s=true;
                }
            }
        }
        return arr;
    }


    public static int[] randArr(int count)
    {
        int[] arr = new int[count];
        for (int i=0; i<count; i++)
        {
            arr[i] = (int)(Math.random()*10001);
        }
        return arr;
    }

    public static void checker(){
        long time= System.nanoTime();
        bubbleSort(randArr(4));
        time=System.nanoTime()-time;
        System.out.println("Time taken: " + time);
    }

    public static boolean isSorted(int[] arr){
        for (int x:arr){
            if (arr[x]>arr[x+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[]before, int[] after){
        int s1= 0 ;
        for (int x:before){
            s1+=before[x];
        }
        int s2=0;
        for (int x:after){
            s1+=after[x];
        }
        return (s1==s2);
    }
}
