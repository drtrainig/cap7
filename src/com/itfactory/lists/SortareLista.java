package com.itfactory.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortareLista {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(4);
        list.add(1);
        
        System.out.print("Lista nesortata: ");
        System.out.println(list);
        
        Collections.sort(list);
        
        System.out.print("Lista sortata: ");
        System.out.println(list);
    }
}
