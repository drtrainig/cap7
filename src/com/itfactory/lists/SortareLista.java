package com.itfactory.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortareLista {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);


        List<Integer> list1 = new ArrayList<>();
        list1.addAll(list);
        list1.addAll(list);
        list1.addAll(list);
        list1.addAll(list);

        System.out.println(list1);
    }
}
