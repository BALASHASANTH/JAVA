// github.com/RodneyShag

package _2_1_Remove_Dups;

import java.util.*;
import common.Node;

public class RemoveDups {
    static void removeDuplicates(Node head) {
        Set<Integer> set = new HashSet();
        set.add(head.data);
        Node n = head;
        while (n.next != null) {
            if (set.contains(n.next.data)) {
                n.next = n.next.next;
            } else {
                set.add(n.next.data);
                n = n.next;
            }
        }
        return;
    }
}

//  Time Complexity: O(n)
// Space Complexity: O(n)

// Alternate solution: Brute-force compare all pairs (Advantage is low space complexity)
// Use 1 pointer to walk list, and another pointer to check all remaining nodes each time
//  Time Complexity: O(n^2)
// Space Complexity: O(1)
