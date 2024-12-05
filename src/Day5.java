import java.lang.reflect.Array;
import java.util.*;

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

}
