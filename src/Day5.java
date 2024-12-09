import java.util.*;

/**
 * We can always sort the requirements into one long list.
 * <p>
 * Dude, I have thought of several ways of doing this:
 * Try all options per guideline
 * Try all options per set (Higher or lower)
 * Make one long list.
 */

/**
 * There is one wrong list
 */
public class Day5 {

    SetTwoPointO[] guidelines; //preferable it's an array of size 99 with sets in it
    int countCorrectMiddles;
    int countAllMiddles;

    public static void main(String[] args) {
        Day5 today = new Day5();
        today.setUp();
        System.out.println("1: " + today.countCorrectMiddles); //5091   //143
        System.out.println("2: " + today.countAllMiddles);     //4681   //123
    }

    private Day5() {
    }


    private void setUp() {
        String puzzleInput = (new Day5PuzzleInput("big")).input;
        String[] split = puzzleInput.split("\n");

        boolean page = false; //To see if the function of the page changed

        countCorrectMiddles = 0;
        countAllMiddles = 0;

        guidelines = new SetTwoPointO[99];

        for (int i = 0; i < 99; i++) {
            guidelines[i] = new SetTwoPointO();
        }

        for (int i = 0; i < split.length; i++) {
            if (split[i].trim().isEmpty()) {
                page = true;
            } else if (!page) {
                String[] pages = split[i].split("\\|");
                // Put the second value in the after of the first value
                guidelines[Integer.parseInt(pages[0])].after.add(Integer.parseInt(pages[1]));
                // Put the first value in the before of the second value
                guidelines[Integer.parseInt(pages[1])].before.add(Integer.parseInt(pages[0]));
            } else {
                String[] pages = split[i].split(",");
                Integer[] manual = new Integer[pages.length];
                for (int j = 0; j < pages.length; j++) {
                    manual[j] = Integer.parseInt(pages[j]);
                }
                if (seeIfValid(manual)) {
                    countCorrectMiddles += getMiddleValue(manual);
                } else {
                    Integer[] sorted = getSortedList(manual);
                    if (!seeIfValid(sorted)) {
                        System.out.println("uh oh");
                    }

                    int add = getMiddleValue(getSortedList(sorted));
                    countAllMiddles += add;
                }
            }
        }
    }

    public Integer[] getSortedList(Integer[] manual) {
        int i = 0;
        Integer[] sorted = new Integer[manual.length];
        while ( i < manual.length) {
            Integer[] after = Arrays.copyOfRange(manual, i + 1, manual.length); //all the numbers that come after it

            int j = 0;
            while (j < after.length) {
                if (guidelines[manual[i]].before.contains(after[j])) {
                    int old = manual[i];
                    manual[i] = after[j];
                    manual[i + 1 + j] = old;
                    continue;
                }
                j++;
            }
            sorted[i] = manual[i];
            i++;
        }
        return sorted;
    }


    /**
     * [75,47,61,53,29]
     * Set<Integer> pagesAfter = {61, 53, 29}
     * Set<Integer> pagesBefore = {75}
     * check if invalid.
     *
     * @param manual array of the manual thing
     * @return -1 if valid
     */
    private boolean seeIfValid(Integer[] manual) {
        for (int i = 0; i < manual.length; i++) { //for every integer in the array, check:
            Integer[] after = Arrays.copyOfRange(manual, i + 1, manual.length); //all the numbers that come after it
            Set<Integer> pagesAfter = new HashSet<>(Arrays.asList(after));

            if (!Collections.disjoint(pagesAfter, guidelines[manual[i]].before)) {
                return false;
            }
        }
        return true;
    }


    private int getMiddleValue(Integer[] manual) {
        return manual[manual.length / 2];
    }


    /**
     * A class that returns all integers mentioned to be before or after the chosen integer.
     */
    class SetTwoPointO {
        public Set<Integer> before;
        public Set<Integer> after;

        public SetTwoPointO() {
            before = new HashSet<>();
            after = new HashSet<>();
        }
    }

}
