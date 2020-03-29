package edu.sky.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(target - nums[i], k -> new ArrayList<>()).add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            List<Integer> integers = map.get(nums[i]);
            if (integers != null) {
                if (integers.size() == 1 && integers.get(0) != i) {
                    return new int[]{i, integers.get(0)};
                } else if (integers.size() == 2) {
                    int finalI = i;
                    Integer secondIndex = integers.stream().filter(integer -> integer != finalI).findFirst().get();
                    return new int[]{i, secondIndex};
                }
            }
        }
        return null;
    }
}