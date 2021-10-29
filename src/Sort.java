import java.util.List;

public class Sort {
    
    public static void bubbleSort(List<Integer> sortList){
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < sortList.size()-1; i++) {
                if (sortList.get(i) > (sortList.get(i + 1))) {
                    temp = sortList.get(i);
                    sortList.set(i, sortList.get(i + 1));
                    sortList.set(i + 1, temp);
                    sorted = false;
                }
            }
        }

        sortList.forEach((n) -> System.out.print(n + " "));
    }

    public static void selectionSort(List <Integer> sortList){

    }

    public static void insertionSort(List <Integer> sortList){

    }
}
