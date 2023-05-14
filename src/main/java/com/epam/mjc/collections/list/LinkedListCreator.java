package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();
        if (sourceList.size() > 0) {
            for (Integer i : sourceList) {
                if (i % 2 == 0) {
                    result.addLast(i);
                } else {
                    result.addFirst(i);
                }
            }
        }
        return result;
    }
}
