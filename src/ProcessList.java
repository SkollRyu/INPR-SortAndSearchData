import java.util.*;
// More efficient and less biased


public class ProcessList {
    private final ArrayList<Integer> randList = new ArrayList<>(); // It shouldn't be modified after the first initialization
    private ArrayList<Integer> sortList = new ArrayList<>();

    /**
     * Constructor of ProcessList class
     * Goal(s):
     *      (1) To initialize the ArrayList
     *      (2) Generates an ArrayList of listSize of random numbers from 0 to 99
     * @param listSize - the size of list
     */
    public ProcessList(int listSize){
        if (listSize == 0){
            System.out.println("This is an empty list\nWe cannot do sorting and search in an empty list");
            System.exit(0);
        }
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
            System.out.println("====Random List:====");
            for (int i : randList){
                // Check if it is the last element, to make no ',' after the last element
                if (count++ != randList.size() - 1){
                    System.out.print(i + ", ");
                } else {
                    System.out.println(i);
                }
            }
        } else{
            System.out.println("\n====Sorted List:====");
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

    /**
     * Uses any effective method to calculate the most frequent number
     * or numbers in the list and print them out by using hash map
     *
     *
     */
    public void getMostFrequentElementHashMap(){
        System.out.println("\n\n====Most FreqNum using HashMap====");
        HashMap<Integer, Integer> freqHashMap = new HashMap<>();
        for (int i : sortList){
            freqHashMap.put(i, Collections.frequency(sortList, i));
        }
        int maxFreq = Collections.max(freqHashMap.values());
        for (Map.Entry<Integer, Integer> entry : freqHashMap.entrySet()) {
            if (entry.getValue() == maxFreq){
                System.out.println("The most frequent number is " + entry.getKey() + " with frequency: "
                        + entry.getValue());
            }
        }
    }

    /**
     * Uses any effective method to calculate the most frequent number
     * or numbers in the list and print them out by using Array List
     */
    public void getMostFrequentElementArrayList(){

        int maxFreq = 0;
        ArrayList<Integer> maxFreqList = new ArrayList<>();

        // Find the most frequency in the array list
        for (int i : sortList){
            int currCount = 0;
            for (int j : sortList){
                if (i == j ){
                    currCount++;
                }
            }
            if (currCount > maxFreq){
                maxFreq = currCount;
            }
        }

        // Find the number with the max frequency
        for (int i : sortList){
            int currCount = 0;
            for (int j : sortList){
                if (i == j ){
                    currCount++;
                }
            }
            if (currCount == maxFreq && !maxFreqList.contains(i)){
                maxFreqList.add(i);
            }
        }
        System.out.println("\n====Most FreqNum using ArrayList====");
        System.out.println("The most frequency is " + maxFreq);
        System.out.println("The number(s) is/are: ");
        maxFreqList.forEach((n) -> System.out.print(n + " "));
    }


    /**
     * Call all sorting methods, and compare their execution time
     * @param processList
     */
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
