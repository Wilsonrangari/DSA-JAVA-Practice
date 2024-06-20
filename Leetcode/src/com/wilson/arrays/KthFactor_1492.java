package com.wilson.arrays;

import java.util.ArrayList;
import java.util.List;

public class KthFactor_1492 {

    public static void main(String[] args) {
        System.out.println(kthFactor(12, 3)); // Should print 3
    }

    public static int kthFactor(int n, int k) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        if (k <= factors.size()) {
            return factors.get(k - 1);
        } else {
            return -1; // Return -1 if there are not enough factors
        }
    }
}
