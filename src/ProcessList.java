import java.util.ArrayList;
import java.util.Random;
// More efficient and less biased


public class ProcessList {
    private ArrayList<Integer> randList = new ArrayList<Integer>();


    /**
     * Constructor of ProcessList class
     * Goal(s):
     *      (1) To initialize the ArrayList
     *      (2) Generates an ArrayList of listSize of random numbers from 0 to 99
     * @param listSize - the size of list
     */
    public ProcessList(int listSize){
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            int rand = random.nextInt(100);
            randList.add(rand);
        }
    }

    /**
     * A method to print the whole list
     * Goal(s):
     *      (1) Print list using for-each loop/
     */
    public void printList(){
        int count = 0;
        for (int i : randList ){
            // Check if it is the last element, to make no ',' after the last element
            if (count++ != randList.size() - 1){
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * A getter to retrieve private variable to other classes
     * Goal(s):
     *      (1) Returns the ArrayList of random numbers
     * @return randList - the list of randomly generated numbers
     */
    public ArrayList<Integer> getList(){
        return randList;
    }

    /**
     * A method to get the size of randList - allow sort class to use
     * @return randList.size() - the size of randList
     */
    public int getListSize(){
        return randList.size();
    }

    /**
     * Uses any effective method to calculate the most frequent number
     * or numbers in the list and print them out
     * E.g. Max frequency 4 matching number 70
     * - Effectiveness Explain:
     * @return  frequency
     * @return  matching number
     */
    public int getMostFrequentElement(){
        // TODO
        return 1;
    }
}