package Arrays;

import java.util.*;

class Solution {
    public List<Integer> unionArray(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        List<Integer> union = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i])
                    union.add(nums1[i]);
                i++;
            } else if (nums2[j] < nums1[i]) {
                if (union.isEmpty() || union.get(union.size() - 1) != nums2[j])
                    union.add(nums2[j]);
                j++;
            } else {
                // equal elements
                if (union.isEmpty() || union.get(union.size() - 1) != nums1[i])
                    union.add(nums1[i]);
                i++;
                j++;
            }
        }

        // Remaining elements
        while (i < nums1.length) {
            if (union.get(union.size() - 1) != nums1[i])
                union.add(nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            if (union.get(union.size() - 1) != nums2[j])
                union.add(nums2[j]);
            j++;
        }

        return union;
    }
}
