import java.io.*;
import java.util.*;

import static java.lang.System.in;

public class Day1 {

    int[] leftArr;
    int[] rightArr;
    Day1PuzzleInput input;

    public static void main(String[] args) {
        Day1 today = new Day1();
        today.input = new Day1PuzzleInput("big");
        today.setup();
        today.sort();
        System.out.println("Difference: " + today.compare());
        System.out.println("Similarity: " + today.similar());
    }

    public Day1() {
    }

    public void setup() {
        leftArr = new int[input.length];
        rightArr = new int[input.length];

        String[] lines = input.input.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String[] number = lines[i].split("   ");
            try {
                leftArr[i] = Integer.parseInt(number[0]);
                rightArr[i] = Integer.parseInt(number[1]);
            } catch (NumberFormatException e) {
                System.out.println("NaN :/");
            }
        }
    }

    public void sort() {
        Arrays.sort(leftArr);
        Arrays.sort(rightArr);
    }

    public int compare() {
        int totalDifference = 0;
        for (int i = 0; i < leftArr.length; i++) {
            int diff = leftArr[i] - rightArr[i];
            if (diff <= 0) {
                totalDifference -= diff;
            } else {
                totalDifference += diff;
            }
        }
        return totalDifference;
    }

    public int similar() {
        int similarity = 0;
        for (int i = 0; i < leftArr.length; i++) {
            for (int j = 0; j < rightArr.length; j++) {
                if (leftArr[i] == rightArr[j]) {
                    similarity += rightArr[j];
                }
            }
        }
        return similarity;
    }

}