package com.example.demo.exercise;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yubang
 * @date 2019/11/24 4:39 下午
 */
public class No1237FindPositiveIntegerSolutionForAGivenEquation {
    // This is the custom function interface.
    // You should not implement it, or speculate about its implementation
    interface CustomFunction {
        // Returns f(x, y) for any given positive integers x and y.
        // Note that f(x, y) is increasing with respect to both x and y.
        // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
        public int f(int x, int y);
    }

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> results = new LinkedList<>();
        for (int i = 1; i <= z; ++i) {
            for (int j = 1; j <= z; ++j) {
                int value = customfunction.f(i, j);
                if (value == z) {
                    List<Integer> pair = new LinkedList<>();
                    pair.add(i);
                    pair.add(j);
                    results.add(pair);
                } else if (value > z) {
                    break;
                }
            }
        }
        return results;
    }
}
