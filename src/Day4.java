public class Day4 {

    Day4PuzzleInput input;

    public static void main(String[] args) {
        Day4 today = new Day4();

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




}
