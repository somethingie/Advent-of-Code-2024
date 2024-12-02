import java.util.Arrays;

public class Day2 {

    int[][] report;
    Day2PuzzleInput input;

    public static void main(String[] args) {
        Day2 today = new Day2();
        today.input = new Day2PuzzleInput("big");
        System.out.println("Safe levels: " + today.setup(false));
        System.out.println("Safe levels: " + today.setup(true));
    }

    public Day2() {
    }

    private int setup(boolean task2) {
        String[] reports = input.input.split("\n");
        int safelevels = 0;
        for (int i = 0; i < reports.length; i++) {
            String[] levels = reports[i].split("\\s");
            int[] level = new int[levels.length];
            for (int j = 0; j < levels.length; j++) {
                level[j] = Integer.parseInt(levels[j]);
            }
            safelevels += safelevels(level, 0, task2);
        }
        return safelevels;
    }

    private int safelevels(int[] level, int problemm, boolean task2) {
        int problem = 0;
        if (level[1] - level[0] > 3 || level[1] - level[0] < -3 || level[1] - level[0] == 0) {
            problem = 1;
        }
        for (int i = 2; i < level.length; i++) {
            if (level[i] - level[i - 1] > 3 || level[i] - level[i - 1] < -3 || level[i] - level[i - 1] == 0) {
                problem = 1;
                break;
            }
            if ((level[i] <= level[i - 1] || level[i - 1] <= level[i-2]) && (level[i] >= level[i - 1] || level[i - 1] >= level[i-2])) {
                problem = 1;
                break;
            }
        }
        if (problem == 0) {
            return 1;
        } else  if (task2 && problemm == 0) {
            int oneRemoved = 0;
            for (int i = 0; i < level.length && oneRemoved < 1; i++) {
                int[] newLevel = new int[level.length - 1];
                boolean gottem = false;
                for (int j = 0; j < newLevel.length; j++) {
                    if (i != j || gottem) {
                        if (gottem) {
                            newLevel[j] = level[j+1];
                        } else {
                            newLevel[j] = level[j];
                        }
                    } else {
                        j--;
                        gottem = true;
                    }
                }
                oneRemoved += safelevels(newLevel, problem, true);
            }
            return oneRemoved;
        } else {
            return 0;
        }
    }
}
