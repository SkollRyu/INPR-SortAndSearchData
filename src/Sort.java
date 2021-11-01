import java.util.ArrayList;


public class Sort {
    // Static method allows Main class to use this method without initialing object

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> sortList, int listSize){
        // Initialization
        int temp;

        // Base Case
        if (listSize == 1 || listSize == 0){ return sortList; }

        for (int i = 0; i < listSize - 1; i++) {
            if (sortList.get(i) > (sortList.get(i + 1))){
                temp = sortList.get(i);
                sortList.set(i, sortList.get(i + 1));
                sortList.set(i + 1, temp);
            }
        }

        // Sorted elements are at the end of Array list
        // So we avoid comparison between sorted elements by reducing the list Size (locally)
        bubbleSort(sortList, listSize -1);

        // Return sort list after recursive bubble sort method
        return sortList;
    }

    public static ArrayList<Integer> selectionSort(ArrayList <Integer> sortList){
        // Set the size of ArrayList
        int listSize = sortList.size();

        // Return sort list if the Arraylist is empty or just contains 1 element
        if (listSize == 1 || listSize == 0){
            return sortList;
        } else {
            for (int i = 0; i < listSize ; i++) {
                // By definition, we assume the first element in the array is the smallest
                int min_index = i;

                // Find the index of minimum num between (i + 1)th elements to the last element in the ArrayList
                for (int j = i; j < listSize ; j++) {
                    if (sortList.get(j) < sortList.get(min_index)){
                        min_index = j;
                    }
                }

                // Swap
                int temp = sortList.get(min_index);
                sortList.set(min_index, sortList.get(i));
                sortList.set(i, temp);
            }
        }

        // Return sort list after selection sort method
        return sortList;
    }

    public static ArrayList<Integer> insertionSort(ArrayList <Integer> sortList){
        int listSize = sortList.size();

        // (1) First unsorted element
        // (2) compare to sorted list from right to left
        // (3) Insert it and swift element behind it to right

        // Key
        for (int i = 1; i < listSize; i++) {
            int keyValueContainer = sortList.get(i);
            int j = i - 1;
            while ((j > -1) && keyValueContainer < sortList.get(j)){
                // Shift sort elements which is smaller than the key value to right by 1
                sortList.set(j + 1, sortList.get(j));
                j--;
            }
            // Since i-- in the end, we need to +1 to set it back the right position
            sortList.set(j + 1, keyValueContainer);
        }

        return sortList;
    }

    public static void mergeSort(ArrayList <Integer> sortList){

    }

    public static void quickSort(ArrayList <Integer> sortList){

    }
}
