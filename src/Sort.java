import java.util.ArrayList;


public class Sort {
    // Static method allows Main class to use this method without initialing object


    /**
     * Bubble sort - Compare adjacent elements
     *      Time Complexity - O(n^2)
     *      Space Complexity - O(1)
     * @param sortList - sortList
     * @param listSize - the size of sortList
     * @return sortList - to private sortList in the ProcessList Class
     */
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> sortList, int listSize){

        // Initialization
        int temp;

        // Base Case
        if (listSize <= 1){ return sortList; }

        // loop
        for (int i = 0; i < listSize - 1; i++) {
            if (sortList.get(i) > (sortList.get(i + 1))){
                // Swap
                temp = sortList.get(i);
                sortList.set(i, sortList.get(i + 1));
                sortList.set(i + 1, temp);
            }
        }

        // Sorted elements are at the end of Array list
        // So we avoid comparison between sorted elements by reducing the list Size (locally)
        bubbleSort(sortList, listSize - 1);

        // Return sort list after recursive bubble sort method
        return sortList;
    }


    /**
     * Selection sort - In-place Comparison
     *      Time Complexity - O(n^2), even the best case is still O(n^2)
     *      Space Complexity - O(1)
     * @param sortList - sortList
     * @return sortList - to private sortList in the ProcessList Class
     */
    public static ArrayList<Integer> selectionSort(ArrayList <Integer> sortList){
        // Set the size of ArrayList
        int listSize = sortList.size();

        // Return sort list if the Arraylist is empty or just contains 1 element
        if (listSize <= 1){
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

    /**
     * Insertion sort - In-place Comparison
     *      Time Complexity - O(n^2), even the best case is still O(n^2)
     *      Space Complexity - O(1)
     * @param sortList - sortList
     * @return sortList - to private sortList in the ProcessList Class
     */
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


    /**
     * Merge Sort - Top-down Implementation using ArrayList
     *      Time Complexity - O(n log n)
     *      Space Complexity - O(n), because we need to initialize array for split elements
     * @param sortList - sortList
     * @return sortList - to private sortList in the ProcessList Class
     */
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> sortList){
        // Initialization
        int listSize = sortList.size();
        int middle = sortList.size() / 2; // to split array into half
        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();

        // Base Case
        if(listSize <= 1) {return sortList;}

        // Split the list into two array list and add their respective elements
        for(int i = 0; i < listSize; i++) {
            if(i < middle) {
                leftList.add(sortList.get(i)); // add first-half elements to left list
            }
            else {
                rightList.add(sortList.get(i)); // add the remaining elements to right list
            }
        }

        // Recursion call
        leftList = mergeSort(leftList); // Divide
        rightList = mergeSort(rightList); // Divide
        sortList = merge(leftList, rightList); // Conquer (Merging)

        return sortList;
    }


    /**
     * Merging Method - bottom-up merging, and comparison to form a sorted list
     * @param leftList - divided array list (first-half)
     * @param rightList - divided array list (remaining)
     * @return mergeList - to the mergeSort method to the sortList array to return
     */
    public static ArrayList<Integer> merge(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        // Initialization - for me to indicate
        ArrayList<Integer> mergeList = new ArrayList<>();

        // While there are any elements in divided list, loop
        while(leftList.size() != 0 || rightList.size() != 0) {
            // Scenario 1: Both L & R list contains elements
            if(leftList.size() != 0 && rightList.size() != 0) {
                // Comparison - find the smallest element of the two lists
                // Since the list has already sorted,
                // so index = 0 will be the smallest elements in each lists
                if(leftList.get(0) < rightList.get(0)) {
                    mergeList.add(leftList.get(0));
                    leftList.remove(0); // remove the elements that has already been used
                }
                else {
                    mergeList.add(rightList.get(0));
                    rightList.remove(0); // remove the elements that has already been used
                }
            }
            // Scenario 2: Only L list contains elements
            else if(leftList.size() != 0) {
                mergeList.add(leftList.get(0));
                leftList.remove(0);
            }
            // Scenario 3: Only R list contains elements
            else {
                mergeList.add(rightList.get(0));
                rightList.remove(0);
            }
        }

        return mergeList;
    }
}
