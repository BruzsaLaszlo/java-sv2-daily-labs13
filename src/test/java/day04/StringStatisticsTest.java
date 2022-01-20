package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringStatisticsTest {

    @Test
    void getVowelsCount() {

        StringStatistics vowelsStat = new StringStatistics();
        var map = vowelsStat.getVowelsCount("magánhangzó = vowel");

        assertEquals(2, map.get('a'));
        assertEquals(1, map.get('e'));
        assertNull(map.get('i'));
        assertEquals(1, map.get('o'));
        assertNull(map.get('u'));

    }
}