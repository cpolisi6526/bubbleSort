package candacepolisi;

public class Main {

    public static void main(String[] args) {
        int[] before= bubbleSort.randArr(3);
        int[] after= bubbleSort.bubbleSort(before);
        System.out.println("Before:" );
        for(int x=0; x<before.length;x++){
            System.out.print(" "+ before[x]);
        }
        System.out.println("\n After:" );
        for(int x=0; x<after.length;x++){
            System.out.print(" "+ after[x]);
        }
        //bubbleSort.checker();
    }
}
