package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.Collections.shuffle;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    BubbleSort bubble = new BubbleSort();

    List<Integer> nums = IntStream.rangeClosed(1, 100).boxed().collect(toList());
    List<Integer> sorted = nums;

    @BeforeEach
    void inic() {
        shuffle(nums);
    }

    @Test
    void sortWithWhile() {
        bubble.sortWithWhile(nums);
        assertEquals(sorted, nums);
    }

    @Test
    void sortWithFor() {
        bubble.sortWithFor(nums);
        assertEquals(sorted, nums);
    }
}