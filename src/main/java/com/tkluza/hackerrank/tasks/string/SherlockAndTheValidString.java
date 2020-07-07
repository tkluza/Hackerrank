package com.tkluza.hackerrank.tasks.string;

import com.tkluza.hackerrank.tasks.AbstractTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SherlockAndTheValidString extends AbstractTask {

    String testData;
    String valid = "NO";

    @Override
    protected void printTaskName() {
        System.out.println("Sherlock and the Valid String");
    }

    @Override
    protected void initTestData() {
        testData = "abcdefghhgfedecba";
    }

    @Override
    protected void solve() {
        valid = isValid(testData);
    }

    private String isValid(String testData) {
        boolean valid;

        String[] splitString = testData.split("");

        Map<String, Long> map = Arrays.stream(splitString)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        if (map.values().stream().allMatch(map.get(splitString[0])::equals)) {
            valid = true;
        } else {

            List<Long> sortedValueList = map.values()
                .stream()
                .sorted(Collections.reverseOrder(Long::compareTo))
                .collect(Collectors.toList());

            Long firstValue = sortedValueList.get(0);
            Long secondValue = sortedValueList.get(1);
            Long lastValue = sortedValueList.get(sortedValueList.size() - 1);
            Long secondToLastValue = sortedValueList.get(sortedValueList.size() - 2);

            if (!firstValue.equals(secondValue) && (firstValue == 1 || firstValue.equals(secondValue + 1)) && lastValue.equals(secondToLastValue)) {
                valid = true;
            } else if (!lastValue.equals(secondToLastValue) && (lastValue == 1 || lastValue.equals(secondToLastValue - 1)) && firstValue.equals(secondValue)) {
                valid = true;
            } else {
                valid = false;
            }
        }

        return valid ? "YES" : "NO";
    }

    @Override
    public void printResult() {
        System.out.println(valid);
    }
}
