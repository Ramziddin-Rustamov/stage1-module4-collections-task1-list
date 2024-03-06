package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> a = new LinkedList<>();
        for (int i=0; i < sourceList.size(); i++) {
            int selectedNumber  = sourceList.get(i);
            if(selectedNumber % 2 == 0){
                a.addLast(selectedNumber);
            }else {
                a.addFirst(selectedNumber);
            }
        }
        return a;
    }


}
