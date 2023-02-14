package com.coding.test.practice;

import java.util.*;

public class MapValueToList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 3};

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int v = map.getOrDefault(n, 0) + 1;
            map.put(n, v);
        }

        List<Integer> klist = new ArrayList<>(map.keySet());
        Collections.sort(klist);
        System.out.println(klist); // [1, 2, 3]

        List<Integer> vlist = new ArrayList<>(map.values());
        Collections.sort(vlist);
        System.out.println(vlist); // [1, 2, 4]
    }
}
