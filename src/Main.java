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
        System.out.println("Random List");
        processList.printList();

        Scanner sc = new Scanner(System.in);
        //Sort list
        System.out.println("Choose 1 sorting method: " +
                "\n1. Bubble Sort " +
                "\n2. Selection Sort " +
                "\n3. Insertion Sort " +
                "\n4. Merge Sort " +
                "\n5. Quick Sort");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                processList.setSortList(Sort.bubbleSort(processList.getList(), processList.getListSize()));
                processList.printList();

                // TODO - rewrite the sorting method name
            case 2:
                processList.setSortList(Sort.bubbleSort(processList.getList(), processList.getListSize()));
                processList.printList();
            case 3:
                processList.setSortList(Sort.bubbleSort(processList.getList(), processList.getListSize()));
                processList.printList();
            case 4:
                processList.setSortList(Sort.bubbleSort(processList.getList(), processList.getListSize()));
                processList.printList();
            case 5:
                processList.setSortList(Sort.bubbleSort(processList.getList(), processList.getListSize()));
                processList.printList();
        }




        // Searching
//        for (int i = 0; i < 100; i++) {
//            if (Search.linearSearch(i, processList.getList()) >= 0) {
//                System.out.println(i + " found ");
//            }
//        }
    }
}
