// github.com/RodneyShag

package _10_04_Sorted_Search_No_Size;

public class SortedSearchNoSize {
    public static int search(Listy list, int value) {
        int index = 1;
        while (list.elementAt(index) != -1 && list.elementAt(index) < value) {
            index *= 2;
        }
        return binarySearch(list, value, index / 2, index);
    }

    public static int binarySearch(Listy listy, int value, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            int midValue = listy.elementAt(mid);
            if (midValue == -1 || midValue > value) {
                end = mid - 1;
            } else if (midValue < value) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

//  Time Complexity: O(log n)
// Space Complexity: O(1)
