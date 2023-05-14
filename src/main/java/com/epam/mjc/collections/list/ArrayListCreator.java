package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        int size = sourceList.size();
        ArrayList<String> result = new ArrayList<>();
        if (size >= 3) {
            for (int i = 1; i <= size; i++) {
                if (i % 3 == 0) {
                    result.add(sourceList.get(i - 1));
                    result.add(sourceList.get(i - 1));
                }
            }
        }
        return result;
    }
}
