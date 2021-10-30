import java.util.ArrayList;


public class Sort {

    // Static method allows Main class to use this method with initialing object
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> sortList, int listSize){
        int temp;
        if (listSize == 1){ return sortList; }

        for (int i = 0; i <  listSize - 1; i++) {
            if (sortList.get(i) > (sortList.get(i + 1))){
                temp = sortList.get(i);
                sortList.set(i, sortList.get(i + 1));
                sortList.set(i + 1, temp);
            }
        }

        bubbleSort(sortList, listSize -1);
        return sortList;
//        sortList.forEach((n) -> System.out.print(n + " "));
    }

    public static void selectionSort(ArrayList <Integer> sortList){

    }

    public static void insertionSort(ArrayList <Integer> sortList){

    }

    public static void mergeSort(ArrayList <Integer> sortList){

    }

    public static void quickSort(ArrayList <Integer> sortList){

    }
}
