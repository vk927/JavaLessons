package sortings;

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsortedArr={3,5,6,1,2,5,9};
        int[] sortedArr=sortElements(unsortedArr);
        for(int i:sortedArr)
            System.out.println(i);

    }

    public static int[] sortElements(int[] unsortedArr){
        for(int i=0;i<unsortedArr.length;i++){
            int min=i;
            for(int j=i+1;j<unsortedArr.length;j++){
                if(unsortedArr[min]>unsortedArr[j]) {
                    min = j;
                }

            }
            int temp=unsortedArr[i];
            unsortedArr[i]=unsortedArr[min];
            unsortedArr[min]=temp;

        }
        return unsortedArr;
    }
}
