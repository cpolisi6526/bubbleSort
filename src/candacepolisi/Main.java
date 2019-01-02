package candacepolisi;

public class Main {

    public static void bubbleSort(){
        int arr[]= {8,6,7,5,3,0,9};
        int temp;
        while(arr[0]<=arr[1] && arr[5]<=arr[6] && arr[3]<=arr[4] && arr[2]<=arr[3]) {
            for (int i=0 ; i < arr.length; i++) {
                if (arr[i] <= arr[i + i]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for(int a=0; a<arr.length;a++){
            System.out.print(arr[a]);
        }
    }
    public static void main(String[] args) {
        bubbleSort();
    }
}
