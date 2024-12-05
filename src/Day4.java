import java.util.Arrays;

/**
 * Alright, I'm thinking here:
 * There are 3 cases:
 * 1) horizontal:
 * XMAS and SAMX
 * <p>
 * 2) vertical:
 * X S
 * M A
 * A M
 * S X
 * <p>
 * 3) diagonal:
 * X S       S X
 * M A     A M
 * A M   M A
 * S X X S
 * <p>
 * <p>
 * So     . . .
 * M A S
 * . . .
 * <p>
 * So we make a double array and just check everything.
 * Specifically if A is surrounded by an M and an S,
 * and if they are then we check in front of M for an X
 */
public class Day4 {

    String input;
    String[][] array;

    public static void main(String[] args) {
        Day4 today = new Day4();
        today.makeArray();
        System.out.println("Amount of XMAS': " + today.countXMAS());
        System.out.println("Amount of X-MAS': " + today.countMAS());
    }

    Day4() {
        input = (new Day4PuzzleInput("big")).input;
    }

    private void makeArray() {
        String[] rows = input.split("\n");
        array = new String[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            array[i] = rows[i].split("");
        }
    }

    private int countMAS() {
        int count = 0;


        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array[i].length - 1; j++) {
                if (array[i][j].equals("A")) {
                    String topLeft = array[i - 1][j - 1];
                    String topRight = array[i - 1][j + 1];
                    String bottomLeft = array[i + 1][j - 1];
                    String bottomRight = array[i + 1][j + 1];
                    if (topLeft.equals("M") && topRight.equals("M") && bottomLeft.equals("S") && bottomRight.equals("S")) {
                        count++;
                    } else if (topLeft.equals("M") && topRight.equals("S") && bottomLeft.equals("M") && bottomRight.equals("S")) {
                        count++;
                    } else if (topLeft.equals("S") && topRight.equals("S") && bottomLeft.equals("M") && bottomRight.equals("M")) {
                        count++;
                    } else if (topLeft.equals("S") && topRight.equals("M") && bottomLeft.equals("S") && bottomRight.equals("M")) {
                        count++;
                    }
                }
            }
        }


        return count;
    }

    private int countXMAS() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals("A")) {
                    if (i != 0 && j != 0 && i != array.length - 1 && j != array[i].length - 1) {
                        count += checkXMAS(i, j);
                    } else if ((i == 0 || i == array.length - 1) && (j != 0 || j != array[i].length - 1)) {
                        if (j > 1 && array[i][j - 1].equals("M") && array[i][j - 2].equals("X") && array[i][j + 1].equals("S")) {
                            count++;
                        } else if (j < array[i].length - 2 && array[i][j + 1].equals("M") && array[i][j + 2].equals("X") && array[i][j - 1].equals("S")) {
                            count++;
                        }
                    } else if ((i != 0 || i != array.length - 1) && (j == 0 || j == array[i].length - 1)) {
                        if (i > 1 && array[i - 1][j].equals("M") && array[i - 2][j].equals("X") && array[i + 1][j].equals("S")) {
                            count++;
                        } else if (i < array.length - 2 && array[i + 1][j].equals("M") && array[i + 2][j].equals("X") && array[i - 1][j].equals("S")) {
                            count++;
                        }
                    } // else { corners, nothing to find here}
                }
            }
        }
        return count;
    }

    private int checkXMAS(int i, int j) {
        int count = 0;

        if (i > 1) {
            if (array[i - 1][j].equals("M") && array[i - 2][j].equals("X") && array[i + 1][j].equals("S")) {
                count++;
            }

            if (j > 1 && array[i - 1][j - 1].equals("M") && array[i - 2][j - 2].equals("X") && array[i + 1][j + 1].equals("S")) {
                count ++;
            }
            if (j < array[i].length - 2 && array[i - 1][j + 1].equals("M") && array[i - 2][j + 2].equals("X") && array[i + 1][j - 1].equals("S")) {
                count ++;
            }
        }
        if (i < array.length - 2) {
            if (array[i + 1][j].equals("M") && array[i + 2][j].equals("X") && array[i - 1][j].equals("S")) {
                count++;
            }

            if (j > 1 && array[i + 1][j - 1].equals("M") && array[i + 2][j - 2].equals("X") && array[i - 1][j + 1].equals("S")) {
                count++;
            }
            if (j < array[i].length - 2 && array[i + 1][j + 1].equals("M") && array[i + 2][j + 2].equals("X") && array[i - 1][j - 1].equals("S")) {
                count++;
            }
        }
        if (j > 1 && array[i][j - 1].equals("M") && array[i][j - 2].equals("X") && array[i][j + 1].equals("S")) {
            count++;
        }
        if (j < array[i].length - 2 && array[i][j + 1].equals("M") && array[i][j + 2].equals("X") && array[i][j - 1].equals("S")) {
            count++;
        }

        return count;
    }


}
