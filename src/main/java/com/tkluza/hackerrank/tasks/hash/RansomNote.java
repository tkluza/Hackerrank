package com.tkluza.hackerrank.tasks.hash;

import com.tkluza.hackerrank.tasks.AbstractTask;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RansomNote extends AbstractTask {

    String magazine;
    String note;
    String valid;

    @Override
    protected void printTaskName() {
        System.out.println("Hash Tables: Ransom Note");
    }

    @Override
    protected void initTestData() {
        magazine = "two times three is not four";
        note = "two times two is four";
    }

    @Override
    protected void solve() {
        this.checkMagazine(magazine.split(" "), note.split(" "));
    }

    private void checkMagazine(String[] magazine, String[] note) {
        Map<String, Long> magazineMap = Arrays.stream(magazine)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> noteMap = Arrays.stream(note)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        boolean allMatch = noteMap.entrySet()
            .stream()
            .allMatch(entry -> this.match(entry, magazineMap));

        valid = allMatch ? "Yes" : "No";
    }

    private boolean match(Map.Entry<String, Long> entry, Map<String, Long> map) {
        return map.containsKey(entry.getKey())
            && map.get(entry.getKey()).intValue() >= entry.getValue().intValue();
    }

    @Override
    public void printResult() {
        System.out.println(valid);
    }
}
