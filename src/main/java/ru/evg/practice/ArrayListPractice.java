package ru.evg.practice;

import java.util.ArrayList;

public class ArrayListPractice {
    static void main() {
    ArrayList<Integer> numbers = new ArrayList<>();
    int nums [] = {12, 3, 8, 1, 15, 4, 7, 2, 20, 5};
        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 5) {
                numbers.remove(i);

            }
        }
        System.out.println(numbers);
    }
}