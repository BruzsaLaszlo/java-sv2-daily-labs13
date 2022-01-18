package day01;

import java.util.List;

import static java.util.Collections.swap;

public class BubbleSort {


    public void sortWithWhile(List<Integer> nums) {
        int i = nums.size();
        while (--i > 0) {
            int j = 0;
            int last = 0;
            while (j++ < i) {
                if (nums.get(j - 1) > nums.get(j)) {
                    swap(nums, j, j - 1);
                    last = j;
                }
            }
            i = last + 1;
        }
    }

    public void sortWithFor(List<Integer> nums) {
        for (int i = nums.size(); 0 < i; i--) {
            int last = 0;
            for (int j = 1; j < i; j++) {
                if (nums.get(j - 1) > nums.get(j)) {
                    swap(nums, j, j - 1);
                    last = j;
                }
            }
            i = last + 1;
        }
    }

}
