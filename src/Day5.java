import java.util.*;

/**
 * We can always sort the requirements into one long list.
 * 
 * Dude, I have thought of several ways of doing this:
 * Try all options per guideline
 * Try all options per set (Higher or lower)
 * Make one long list. 
 */
public class Day5 {

    SetTwoPointO[] guidelines; //preferable it's an array of size 99 with sets in it
    Integer[] sortedlist;
    int countCorrectMiddles;

    public static void main(String[] args) {
        Day5 today = new Day5();
        today.setUp();
        System.out.println("1: " + today.countCorrectMiddles);
//        today.tryToSort();
    }

    private Day5() {
    }


    private void setUp() {
        String puzzleInput = (new Day5PuzzleInput("big")).input;
        String[] split = puzzleInput.split("\n");
        sortedlist = new Integer[99];

        boolean page = false; //To see if the function of the page changed

        countCorrectMiddles = 0;

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
                    //cry
                    //or Sort them and then count middle.
                }
            }
        }
    }

//    private void tryToSort(Integer[] toSort) {
//
//    }

    /**
     * [75,47,61,53,29]
     * Set<Integer> pagesAfter = {61, 53, 29}
     * Set<Integer> pagesBefore = {75}
     * check if invalid.
     *
     * @param manual array of the manual thing
     * @return true if valid
     */
    private boolean seeIfValid(Integer[] manual) {
        for (int i = 0; i < manual.length; i++) { //for every integer in the array, check:
            Integer[] after = Arrays.copyOfRange(manual, i + 1, manual.length); //all the numbers that come after it
            Set<Integer> pagesAfter = new HashSet<>(Arrays.asList(after));

            ; // All the values that should be before it
//            System.out.println(manual[i] + " Before: " + Arrays.toString(guidelines[manual[i]].before.toArray()) + " After: " + Arrays.toString(guidelines[manual[i]].after.toArray()));
            if (!Collections.disjoint(pagesAfter, guidelines[manual[i]].before)) {
                return false;
            }

            Integer[] before = Arrays.copyOfRange(manual, 0, i + 1);
            Set<Integer> pagesBefore = new HashSet<>(Arrays.asList(before));

            if (!Collections.disjoint(pagesBefore, guidelines[manual[i]].after)) {
                return false;
            }
        }
        return true;
    }

    private int getMiddleValue(Integer[] manual) {
        return manual[manual.length / 2];
    }

    private int getCountCorrectMiddles() {
        return countCorrectMiddles;
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
