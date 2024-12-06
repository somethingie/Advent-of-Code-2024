import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3 {

    Day3PuzleInput input;

    public static void main(String[] args) {
        Day3 today = new Day3();
        System.out.println("Mul: " + today.readDosandDonts(false));
        System.out.println("Mul with Do: " + today.readDosandDonts(true));
    }

    public Day3() {
        input = new Day3PuzleInput("big");
    }

    public int readDosandDonts(boolean doIt) {
        if (!doIt) {
            return readForMul(input.input);
        }
//        Pattern p = Pattern.compile("don't\\(\\)");
//        Matcher m = p.matcher(input.input);
//        String newInput = m.replaceAll("");

        String newInput = input.input;
        while (newInput.contains("don't()")) {
            String value = newInput.substring(newInput.indexOf("don't()"),
                    newInput.indexOf("do()", newInput.indexOf("don't()")));
            newInput = newInput.replace(value, "");
        }
        return readForMul(newInput);
    }

    public int readForMul(String input) {
        int added = 0;

        Pattern p = Pattern.compile("mul\\([0-9]+,[0-9]+\\)");
        Matcher matcher = p.matcher(input);
        while (matcher.find()) {
            added += multiply(matcher.group());
        }
        return added;
    }

    public int multiply(String mul){
        Pattern p = Pattern.compile("[0-9]+");
        Matcher matcher = p.matcher(mul);
        int multiplied = 0;
        matcher.find();
        int multiplied1 = Integer.parseInt(matcher.group());
        matcher.find();
        int multiplied2 = Integer.parseInt(matcher.group());
        multiplied = multiplied1 * multiplied2;
        return multiplied;
    }
}
