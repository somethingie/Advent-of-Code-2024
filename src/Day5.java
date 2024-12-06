import java.lang.reflect.Array;
import java.util.*;

/**
 * We can always sort the requirements into one long list.
 */
public class Day5 {

    Set<Tuple> guidelines;
    List<Integer[]> manual;

    public static void main(String[] args) {
        Day5 today = new Day5();
        today.setUp();
    }

    private Day5() {
    }


    private void setUp() {
        String puzzleInput = (new Day5PuzzleInput("small")).input;
        String[] split = puzzleInput.split("\n");
        boolean page = false;
        int ind = 0;
        manual = new ArrayList<Integer[]>();
        for (int i = 0; i < split.length; i++) {
            String line = split[i];
            if (line.trim().isEmpty()) {
                ind = i;
                page = true;
            } else if (!page) {
                String[] pages = line.split("\\|");
                guidelines = new HashSet<Tuple>();
                guidelines.add(new Tuple(Integer.parseInt(pages[0]), Integer.parseInt(pages[1])));;
            } else {
                String[] pages = line.split(",");
                Integer[] index = new Integer[pages.length];
                for (int j = 0; j < pages.length; j++) {
                    index[j] = Integer.parseInt(pages[j]);
                }
                manual.add(index);
            }
        }
    }

    private int countmiddles() {
        int index = getIndex(0);
        int count = 0;
        while (index != -1) {
            //get middle
            //count up middle
            index = getIndex(index);
        }
        return count;
    }

    /**
     * Returns the index of the correct lists in manuel. It does this by comparing them to the Set guidelines.
     * @param begin
     * @return
     */
    private int getIndex(int begin) {

        return -1;
    }




    class Tuple {
        int first;
        int second;

        public Tuple(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }

    /**
     * A class that returns all integers mentioned to be before or after the chosen integer.
     */
    class BeforeAfter {
        Integer[] before;
        Integer[] after;

        public BeforeAfter() {
            for (int i = 0; i < ; i++) {

            }
        }

        public Integer[] getBefore() {
            return before;
        }

        public Integer[] getAfter() {
            return after;
        }
    }

}
