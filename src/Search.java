import java.util.ArrayList;

public class Search {

    // The method returns the index of the first matching item found or -1 if the item is not found
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
