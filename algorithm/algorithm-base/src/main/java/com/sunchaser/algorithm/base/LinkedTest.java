package com.sunchaser.algorithm.base;

import java.util.LinkedList;
import java.util.List;

/**
 * 链表：各个元素物理内存空间不连续，通过“指针”将一组零散的内存空间串联起来。指针的链接顺序为链表中元素的逻辑顺序。
 *
 * 基本特点：
 * 链表由一组节点组成，每个节点包含两个部分：一个是存储元素的数据域，另一个是存储下一个节点地址的指针域。
 * 天然支持动态扩容。
 *
 * 分类：
 * 单链表：第一个节点称为头节点，最后一个节点称为尾节点。头节点用来记录链表的基地址，可以通过头节点遍历整个链表。尾节点的指针域指向null。
 * 循环链表：特殊的单链表，与单链表唯一不同的是：尾节点的指针域指向了头节点。
 * 双向链表：每个节点不仅存储数据域和指向下一个节点的指针域，它还会有一个指针域指向前一个节点。通常称为前驱节点和后继节点。
 * 双向循环链表：综合了循环链表和双向链表。头节点的前驱节点指向尾节点，尾节点的后继节点指向头节点。
 *
 * @author sunchaser
 * @date 2020/6/2
 * @since 1.0
 */
public class LinkedTest {
    public static void main(String[] args) {
        // LinkedList 双向链表
        List<String> linked = new LinkedList<>();
        linked.add("abc");
        linked.add("def");
        System.out.println(linked.get(0));
        System.out.println(linked.get(1));
    }
}