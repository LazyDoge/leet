package edu.sky.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    /*
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     */
    @Test
    void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        testAndPrintMethod(l1, l2);

    }


    /*
    [1]
    [9,9]
     */
    @Test
    void setAddTwoNumbers2() {
        ListNode l1 = new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);

        testAndPrintMethod(l1, l2);
    }

    private void testAndPrintMethod(ListNode l1, ListNode l2) {
        ListNode listNode = addTwoNumbers.addTwoNumbers(l1, l2);

        while (listNode.next != null) {
            System.out.println("listNode = " + listNode.val);
            listNode = listNode.next;
        }
        System.out.println("listNode.val = " + listNode.val);
    }

}