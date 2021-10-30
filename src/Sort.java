import java.util.ArrayList;


public class Sort {
    // Static method allows Main class to use this method with initialing object

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> sortList, int listSize){
        int temp;

        // Base Case
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
    }

    public static ArrayList<Integer> selectionSort(ArrayList <Integer> sortList){



        // By definition, we assume the first element in the array is the smallest
        for (int i = 0; i < sortList.size() ; i++) {
            // Find the index of min num between (i + 1)th elements to the last element
            int min_index = i;
            for (int j = i; j < sortList.size() ; j++) {
                if (sortList.get(j) < sortList.get(min_index)){
                    min_index = j;
                }
            }

            // Swap
            int temp = sortList.get(min_index);
            sortList.set(min_index, sortList.get(i));
            sortList.set(i, temp);
        }
        return sortList;
    }

    public static void insertionSort(ArrayList <Integer> sortList){

    }

    public static void mergeSort(ArrayList <Integer> sortList){

    }

    public static void quickSort(ArrayList <Integer> sortList){

    }
}
