/**
 * This is a program to sort and search data by using ArrayList
 * @author WONG Ho Lung Ryu
 * @version 1.0
 * @since 1.0 ; 25 OCT 2021
 */

public class Main {

    public static void main(String[] args) {
        // Original listSize: 100; I reduce it to 10 to for test

        // Create object from ProcessList class and initialize the random list
        ProcessList processList = new ProcessList(10);
        System.out.println("Random List");
        processList.printList();

        //Sort list
        System.out.println("Chosen Sort");
        Sort.bubbleSort(processList.getList());
//        Sort.selectionSort(processList.getList());
//        processList.printList();

//        for (int i = 0; i < 100; i++) {
//            if (Search.linearSearch(i, processList.getList()) >= 0) {
//                System.out.println(i + " found ");
//            }
//        }
    }
}
