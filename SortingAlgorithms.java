import java.util.*;

public class SortingAlgorithms {

    public static void bubbleSort(ArrayList<Product> list) {

        int n = list.size();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (list.get(j).price > list.get(j + 1).price) {

                    Product temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);

                }
            }
        }
    }
}
