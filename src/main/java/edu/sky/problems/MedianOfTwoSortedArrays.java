package edu.sky.problems;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * You may assume nums1 and nums2 cannot be both empty.
 * <p>
 * Example 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * Example 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 */

public class MedianOfTwoSortedArrays {

    private static int[] shorter;
    private static int[] longer;
    private static int halfLength;
    private static int pointer = -1;
    private static final MedianElement medianElement = new MedianElement();

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        halfLength = (nums1.length + nums2.length + 1) / 2;
        if (nums1.length == 0) {
            return getMedianOfArray(nums2);
        } else if (nums2.length == 0) {
            return getMedianOfArray(nums1);
        }
        if (nums1.length > nums2.length) {
            shorter = nums2;
            longer = nums1;
        } else {
            shorter = nums1;
            longer = nums2;
        }
        int shorterPointer = (shorter.length - 1) / 2;
        medianElement.setMedianElementBorders(shorterPointer);

        getNewShorterPointer(shorterPointer, (shorter.length + 1) / 2, false);
        medianElement.setMedianElementBorders(pointer);

        return findMedian();
    }

    private double findMedian() {
        int maxLeft = Math.max(medianElement.getShorterLeft(), medianElement.getLongerLeft());
        if (((shorter.length + longer.length) % 2) == 0) {
            int minRight = Math.min(medianElement.getShorterRight(), medianElement.getLongerRight());
            return ((double) maxLeft + minRight) / 2;
        } else {
            return maxLeft;
        }
    }

    private void getNewShorterPointer(int shorterPointer, int distance, boolean isGrater) {
        if (checkSplit(shorterPointer)) {
            pointer = shorterPointer;
        } else {
            int newDistance = (distance + 1) / 2;
            if (medianElement.getShorterLeft() > medianElement.getLongerRight()) {
                int shorterPointerToTheLeft = shorterPointer - newDistance;
                if (shorterPointerToTheLeft < 0) {
                    pointer = -1;
                    return;
                }

                getNewShorterPointer(shorterPointerToTheLeft, newDistance, false);
            } else if (medianElement.getLongerLeft() > medianElement.getShorterRight()) {

                int shorterPointerToTheRight = shorterPointer + newDistance;
                if (shorterPointerToTheRight >= shorter.length) {
                    pointer = shorter.length - 1;
                    return;
                }

                getNewShorterPointer(shorterPointerToTheRight, newDistance, true);
            }
        }


    }

    private boolean checkSplit(int shorterPointer) {
        medianElement.setMedianElementBorders(shorterPointer);
        boolean isFonded = medianElement.getShorterLeft() <= medianElement.getLongerRight()
                && medianElement.getLongerLeft() <= medianElement.getShorterRight();
        return isFonded;

    }

    private double getMedianOfArray(int[] single) {
        int left = (single.length - 1) / 2;
        if (single.length % 2 == 0) {
            return ((double) (single[left] + single[left + 1])) / 2;
        } else {
            return single[left];
        }
    }

    private static class MedianElement {
        private int shorterLeft;
        private int shorterRight;
        private int longerLeft;
        private int longerRight;

        public int getShorterLeft() {
            return shorterLeft;
        }

        public int getShorterRight() {
            return shorterRight;
        }

        public int getLongerLeft() {
            return longerLeft;
        }

        public int getLongerRight() {
            return longerRight;
        }

        public void setMedianElementBorders(int shorterPointer) {
            int longerPointer = halfLength - shorterPointer - 2;
            if (shorterPointer < 0) {
                shorterLeft = Integer.MIN_VALUE;
            } else {
                shorterLeft = shorter[shorterPointer];
            }
            if (shorterPointer + 1 >= shorter.length) {
                shorterRight = Integer.MAX_VALUE;
            } else {
                shorterRight = shorter[shorterPointer + 1];
            }
            if (longerPointer < 0) {
                longerLeft = Integer.MIN_VALUE;
            } else {
                longerLeft = longer[longerPointer];
            }
            if (longerPointer + 1 >= longer.length) {
                longerRight = Integer.MAX_VALUE;
            } else {
                longerRight = longer[longerPointer + 1];
            }
        }
    }
}
