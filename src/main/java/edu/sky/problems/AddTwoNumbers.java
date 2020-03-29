package edu.sky.problems;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */


import java.math.BigInteger;
import java.util.Arrays;

/**
 * Definition for singly-linked list.
 */
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


//        return stringSolution(l1, l2);
        return directSolution(l1, l2);
    }

    private ListNode stringSolution(ListNode l1, ListNode l2) {
        BigInteger first = getNumber(l1);
        BigInteger second = getNumber(l2);

        BigInteger sum = first.add(second);
        String[] split = new StringBuilder(String.valueOf(sum)).reverse().toString().split("");
        int[] ints = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();

        ListNode result = new ListNode(ints[0]);
        ListNode pointer = result;
        for (int i = 1; i < ints.length; i++) {
            pointer.next = new ListNode(ints[i]);
            pointer = pointer.next;
        }

        return result;


    }

    private BigInteger getNumber(ListNode l1) {
        StringBuilder sb = new StringBuilder();

        while (l1.next != null) {
            sb.append(l1.val);
            l1 = l1.next;
        }
        sb.append(l1.val);
        return new BigInteger(sb.reverse().toString());
    }

    private ListNode directSolution(ListNode l1, ListNode l2) {
        int current = l1.val + l2.val;
        int[] mem = new int[] {current / 10};
        ListNode result = new ListNode(current % 10);
        ListNode pointer = result;
        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            current = mem[0] + l1.val + l2.val;
            pointer.next = new ListNode(current % 10);
            pointer = pointer.next;
            mem[0] = current / 10;
        }
        if (l1.next == null && l2.next != null) {
            pointer = addTail(l2, mem, pointer);
        } else if (l2.next == null && l1.next != null) {
            pointer = addTail(l1, mem, pointer);
        }
        if (mem[0] != 0) {
            pointer.next = new ListNode(mem[0]);
        }
        return result;
    }

    private ListNode addTail(ListNode listNode, int[] mem, ListNode pointer) {
        int current;
        while (listNode.next != null) {
            listNode = listNode.next;
            current = listNode.val + mem[0];
            pointer.next = new ListNode(current % 10);
            pointer = pointer.next;
            mem[0] = current / 10;
        }
        return pointer;
    }
}