import java.util.*;
// More efficient and less biased


public class ProcessList {
    private final ArrayList<Integer> randList = new ArrayList<>();
    private ArrayList<Integer> sortList = new ArrayList<>();


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
     * A method to print the whole list (unsorted: randList // sorted: sortList)
     * Goal(s):
     *      (1) Print list using for-each loop
     */
    public void printList(){
        int count = 0;

        // Check if sortList has been sorted
        if (sortList.isEmpty()){
            for (int i : randList){
                // Check if it is the last element, to make no ',' after the last element
                if (count++ != randList.size() - 1){
                    System.out.print(i + ", ");
                } else {
                    System.out.println(i);
                }
            }
        } else{
            for (int i : sortList){
                // Check if it is the last element, to make no ',' after the last element
                if (count++ != sortList.size() - 1){
                    System.out.print(i + ", ");
                } else {
                    System.out.println(i);
                }
            }
        }

    }


    /**
     * Setter of sortList
     * @param sortList - ArrayList from sorting method
     */
    public void setSortList(ArrayList <Integer> sortList){
        this.sortList = sortList;
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

    // TODO - getMost - simple finding method


    /**
     * Uses any effective method to calculate the most frequent number
     * or numbers in the list and print them out
     * E.g. Max frequency 4 matching number 70
     * - Effectiveness Explain:
     * @return  frequency
     * @return  matching number
     */
    public void getMostFrequentElement(){
        HashMap<Integer, Integer> freqHashMap = new HashMap<>();
        for (int i : sortList){
            freqHashMap.put(i, Collections.frequency(sortList, i));
        }
        for (Map.Entry<Integer, Integer> entry : freqHashMap.entrySet()) {

            System.out.println(entry.getKey() + " : "
                    + entry.getValue());
        }
    }

    public void sortingBenchmark(ProcessList processList){
        long startTime = System.nanoTime();
        processList.setSortList(Sort.bubbleSort(processList.getList(), processList.getListSize()));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Bubble sort:" + duration);

        startTime = System.nanoTime();
        processList.setSortList(Sort.selectionSort(processList.getList()));
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Selection sort:" + duration);

        startTime = System.nanoTime();
        processList.setSortList(Sort.insertionSort(processList.getList()));
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Insertion sort:" + duration);

        startTime = System.nanoTime();
        processList.setSortList(Sort.mergeSort(processList.getList()));
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("merge sort:" + duration);
    }
}
