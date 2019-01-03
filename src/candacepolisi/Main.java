package candacepolisi;

public class Main {

    public static void bubbleSort(int[] arr) {
        int temp;
        for (int x=0;x<50;x++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] >= arr[i + 1]) {
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
        bubbleSort(new int[]{8, 6, 7, 5, 3, 0, 9});
    }
}
