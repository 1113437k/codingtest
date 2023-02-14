package com.coding.test.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        System.out.println(Arrays.toString(arr)); // [1, 3, 2]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]

        List<Integer> list = new ArrayList();
        list.add(4);
        list.add(6);
        list.add(5);
        System.out.println(list); // [4, 6, 5]

        Collections.sort(list);
        System.out.println(list); // [4, 5, 6]
    }
}
