import java.util.ArrayList;

public class Search {

    // The method returns the index of the first matching item found or -1 if the item is not found
    // Do I need to return -1 for every single elements that are not found in the range?
    public static int linearSearch(int searchItem, ArrayList<Integer> searchList){
        int index = -1;
        for(int n : searchList){
            if (n == searchItem){
                index = searchList.indexOf(n);
            }
        }
        return index;
    }

    public static int binarySearch(){
        int index = -1;

        return index;
    }
}
