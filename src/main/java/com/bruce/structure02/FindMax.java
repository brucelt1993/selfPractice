package com.bruce.structure02;

import java.util.Comparator;

/**
 * 获取数组最大值的泛型算法
 */
public class FindMax {
    public static <AnyType> AnyType findMax(AnyType[] arrays, Comparator<? super AnyType> cmp) {
        int maxIndex = 0;
        for (int i = 1; i < arrays.length; i++) {
            if (cmp.compare(arrays[i], arrays[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        return arrays[maxIndex];
    }

    public static void main(String[] args) {
        String[] arrays = {"ss", "aa", "za", "zc", "zzz"};
        System.out.println(findMax(arrays, new StringCompare()));
    }
}

class StringCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
}
