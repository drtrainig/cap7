package com.itfactory.conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] listToArray = (String[]) list.toArray();

        String[] array = {"mar", "par"};
        List<String> arrayToList = Arrays.asList(array);
    }
}
