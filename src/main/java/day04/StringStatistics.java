package day04;

import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StringStatistics {

    public Map<Character, Long> getVowelsCount(String text) {
        return text.toLowerCase().chars()
                .mapToObj(value -> (char) value)
                .filter(character -> switch (character) {
                    case 'a', 'e', 'i', 'o', 'u' -> true;
                    default -> false;
                })
                .collect(groupingBy(
                        character -> character,
                        counting()
                ));
    }

}
