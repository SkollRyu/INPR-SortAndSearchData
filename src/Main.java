/**
 * This is a program to sort and search data by using ArrayList
 * @author WONG Ho Lung Ryu
 * @version 1.0
 * @since 1.0 ; 25 OCT 2021
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Original listSize: 100; I reduce it to 10 to for test

        // Create object from ProcessList class and initialize the random list
        ProcessList processList = new ProcessList(10);
        System.out.println("Random List:");
        processList.printList();

        Scanner sc = new Scanner(System.in);
        //Sort list
        System.out.println("""
                \nMenu\s
                1. Bubble Sort\s
                2. Selection Sort\s
                3. Insertion Sort\s
                4. Merge Sort\s
                5. Quick Sort\s
                6. Select all sorting method and return execution for each sorting method\s
                Choose 1 sorting method:\s""");
        int choice = sc.nextInt();
        switch (choice) {
            // Enhanced Switch
            case 1 -> {
                processList.setSortList(Sort.bubbleSort(processList.getList(), processList.getListSize()));
                processList.printList();
            }
            case 2 -> {
                processList.setSortList(Sort.selectionSort(processList.getList()));
                processList.printList();
            }
            case 3 -> {
                processList.setSortList(Sort.insertionSort(processList.getList()));
                processList.printList();
            }
            case 4 -> {
                processList.setSortList(Sort.mergeSort(processList.getList()));
                processList.printList();
            }
//            case 5:
//                processList.setSortList(Sort.quickSort(processList.getList(), processList.getListSize()));
//                processList.printList();
            case 6 -> {
                processList.sortingBenchmark(processList);
            }
        }

        //Searching
        for (int i = 0; i < 100; i++) {
            if (Search.linearSearch(i, processList.getList()) >= 0) {
                System.out.print(i + " found ");
            }
        }

        processList.getMostFrequentElement(); // printout an array list and its freq num
    }


}
