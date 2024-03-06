package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        List<String> data = new ArrayList<>();
        for (int i= 1; i <= sourceList.size(); i++) {
            if(i % 3 == 0){
                String temp = sourceList.get(i-1);
                data.add(temp);
                data.add(temp);
            }
        }
        return (ArrayList<String>) data;
    }

}
