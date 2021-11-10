import java.util.ArrayList;

public class Search {
    /**
     * The method returns the index of the first matching item found or -1 if the item is not found
     * @param target - the elements I want to find
     * @param searchList - the sorted list
     * @return index - the index of the elements in the sorted list
     */
    public static int linearSearch(int target, ArrayList<Integer> searchList){
        int index = -1;
        for(int n : searchList){
            if (n == target){
                index = searchList.indexOf(n);
            }
        }
        return index;
    }

    /**
     * The method returns the index of the first matching item found or -1 if the item is not found
     * By using binary search, faster when the input size is large
     * @param target - the elements I want to find
     * @param searchList - the sorted list
     * @return index - the index of the elements in the sorted list
     */
    public static int binarySearch(int target, ArrayList<Integer> searchList){
        int start = 0;
        int end = searchList.size() - 1;
        int index = -1; //if target is not found, default return is -1

        while(start <= end){
        // loop until only one index of the target element is left
            int middle = start + (end - start) / 2;
            int midValue = searchList.get(middle);

            if (midValue == target) {
                return middle;
            }

            if (midValue < target){
                start = middle + 1; // abandon the index before middle
            } else {
                end = middle - 1;   // abandon the index after middle
            }
        }

        return index;
    }
}
