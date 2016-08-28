package nyc.c4q.ramonaharrison;

/**
 * Created by Ramona Harrison
 * on 8/28/16
 *
 * Write a Java method that takes a string as a parameter and returns true if it ends in "ly".
 */

public class ProblemFour {

    public static void main(String[] args) {
            System.out.println(endsLy("really"));
    }

    public static boolean endsLy(String input) {
        return input.endsWith("ly");
    }

}
