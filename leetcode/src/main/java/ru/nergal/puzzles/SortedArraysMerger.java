package ru.nergal.puzzles;

import lombok.RequiredArgsConstructor;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To
 * accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * <p>
 * see it online: <a href="https://leetcode.com/problems/merge-sorted-array/">88. Merge Sorted Array</a>
 */
@RequiredArgsConstructor
public class SortedArraysMerger {
    private final int[] nums1;
    private final int m;
    private final int[] nums2;
    private final int n;

    public static SortedArraysMerger createFrom(int[] array1, int[] array2) {
        int[] nums1 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, nums1, 0, array1.length);
        int[] nums2 = new int[array2.length];
        System.arraycopy(array2, 0, nums2, 0, array2.length);
        return new SortedArraysMerger(nums1, array1.length, nums2, array2.length);
    }

    public int[] merge() {
        // this is the requirement, function should return the nums1 array
        return nums1;
    }
}