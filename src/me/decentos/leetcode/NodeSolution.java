package me.decentos.leetcode;

import me.decentos.leetcode.sorting.M147InsertionSortList;
import me.decentos.leetcode.util.ListNode;

public class NodeSolution {
    public static void main(String[] args) {
//        ListNode headA = ListNode.createList(4, 1);
//        ListNode headB = ListNode.createList(5, 6, 1);
//        ListNode intersectPart = ListNode.createList(8, 4, 5);
//        ListNode nodeA = new ListNode(0, headA);
//        ListNode nodeB = new ListNode(0, headB);
//        while (headA.next != null) {
//            headA = headA.next;
//        }
//        headA.next = intersectPart;
//        while (headB.next != null) {
//            headB = headB.next;
//        }
//        headB.next = intersectPart;
//        ListNode result = E160IntersectionTwoLists.getIntersectionNode(nodeA.next, nodeB.next);
//        ListNode result = MiddleOfList.middleNode(head);
//        ListNode result = M19RemoveNodeFromEnd.removeNthFromEnd(head, 2);
//        ListNode result = M328OddEvenList.oddEvenList2(head);
//        ListNode head = ListNode.createList(3,5,1);
//        ListNode cur = head;
//        while (cur.next != null) cur = cur.next;
//        cur.next = head;
//        ListNode result = M708InsertCircularList.insert(head, 6);
//        ListNode result = E206ReverseList.reverseList2(head);
//        while (result != null) {
//            System.out.print(result.val + ", ");
//            result = result.next;
//        }
//        System.out.println();
//        ListNode head = ListNode.createList(1,2);
//        ListNode result = M61RotateList.rotateRight(head, 2);
        ListNode head = ListNode.createList(4,2,1,3);
        M147InsertionSortList.insertionSortList(head);
    }
}
