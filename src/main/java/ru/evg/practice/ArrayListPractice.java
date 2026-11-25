package ru.evg.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int[] nums2 = {1, 2, 3, 12, 4, 4, 9, 0, 5, 1, 6, 2};
        for (int i = 0; i < nums2.length; i++) {
            numbers.add(nums2[i]);
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 5) {
                numbers.remove(i);
                i--;
            }
        }
        System.out.println(numbers);
        System.out.println(numbers.size() + " - Колличество элеметов ");
    }
}