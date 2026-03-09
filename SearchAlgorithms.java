import java.util.*;

public class SearchAlgorithms {

    public static Product binarySearch(ArrayList<Product> list, int price) {

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (list.get(mid).price == price)
                return list.get(mid);

            if (list.get(mid).price < price)
                low = mid + 1;
            else
                high = mid - 1;

        }

        return null;
    }
}
