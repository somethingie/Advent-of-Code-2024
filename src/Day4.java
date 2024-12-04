import java.util.Arrays;

public class Day4 {

    Day4PuzzleInput input;
    String[][] array;

    public static void main(String[] args) {
        Day4 today = new Day4();
        today.makeArray();
    }

    Day4() {
        input = new Day4PuzzleInput("small");
    }

    /**
     * Alright, I'm thinking here:
     * There are 3 cases:
     * 1) horizontal:
     * XMAS and SAMX
     *
     * 2) vertical:
     * X S
     * M A
     * A M
     * S X
     *
     * 3) diagonal:
     * X S       S X
     *  M A     A M
     *   A M   M A
     *    S X X S
     *
     *
     * So     . . .
     *        M A S
     *        . . .
     *
     * So we make a double array and just check everything.
     * Specifically if A is surrounded by an M and an S,
     * and if they are then we check in front of M for an X
     */
    private void makeArray() {
        String[] rows = input.input.split("\n");
        array = new String[rows.length][];
        for (int i = 0; i < rows.length ; i++) {
            array[i] = rows[i].split("");
            System.out.println(Arrays.toString(array[i]));
        }
    }

    private int countXMAS() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals("M")) {
                    if (i!=0 && j!=0 && i!=array.length-1 && j!=array[i].length-1) {
                    //TODO: check around it
                    }else if ((i == 0 || i == array.length - 1) && (j!=0 || j!=array[i].length - 1)) {
                        //TODO: check neighbours
                    } else if ((i != 0 || i != array.length - 1) && (j==0 || j==array[i].length - 1)) {
                        //TODO: check neighbours
                    } // else { corners, nothing to find here}
                }
            }
        }
        return count;
    }




}
