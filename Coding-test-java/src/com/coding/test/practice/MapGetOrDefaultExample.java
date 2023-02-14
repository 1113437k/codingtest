package com.coding.test.practice;

import java.util.HashMap;
import java.util.Map;

public class MapGetOrDefaultExample {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 5};
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        System.out.println(map); // {1=3, 2=2, 3=1, 4=3, 5=3}

        // refactor
        map.clear();
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int v = map.getOrDefault(n, 0) + 1;
            map.put(n, v);
        }
        System.out.println(map); // {1=3, 2=2, 3=1, 4=3, 5=3}
    }
}
