package com.practice.chapter1;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharactersDemo {
    public static void main(String[] args) {
        System.out.println(findDuplicateChars("Bijan Nayak"));

    }
    public static Map<Character, Long> findDuplicateChars(String value) {
        return value.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        character -> character, Collectors.counting()
                ));
    }
}
