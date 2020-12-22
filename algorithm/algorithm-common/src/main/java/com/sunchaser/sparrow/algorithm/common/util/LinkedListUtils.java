package com.sunchaser.sparrow.algorithm.common.util;

import com.sunchaser.sparrow.algorithm.common.SinglyLinkedListNode;

/**
 * 链表工具类
 * @author sunchaser admin@lilu.org.cn
 * @since JDK8 2020/12/23
 */
public class LinkedListUtils {
    private LinkedListUtils() {
    }

    /**
     * 构造一个单链表: 1 -> 2 -> 3 -> 4 -> 5
     * @return 单链表头节点
     */
    public static SinglyLinkedListNode generateSinglyLinkedList() {
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(5,null);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(4,node4);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(3,node3);
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(2,node2);
        return new SinglyLinkedListNode(1,node1);
    }

    /**
     * 构造一个环形链表：1 -> 2 -> 3 -> 4 -> 5
     *                          ↑         丨
     *                          丨________丨
     * @return 有环的链表
     */
    public static SinglyLinkedListNode generateCycleSinglyLinkedList() {
        SinglyLinkedListNode node4 = new SinglyLinkedListNode(5,null);
        SinglyLinkedListNode node3 = new SinglyLinkedListNode(4,node4);
        SinglyLinkedListNode node2 = new SinglyLinkedListNode(3,node3);
        SinglyLinkedListNode node1 = new SinglyLinkedListNode(2,node2);
        node4.setNext(node2);
        return new SinglyLinkedListNode(1,node1);
    }

    /**
     * 按顺序打印单链表
     * @param head 要打印的单链表头节点
     */
    public static void printLink(SinglyLinkedListNode head) {
        if (head == null) {
            System.out.print("");
            return;
        }
        if (head.next == null) {
            System.out.println("->" + head.val);
            return;
        }
        System.out.print("->" + head.val);
        printLink(head.next);
    }
}