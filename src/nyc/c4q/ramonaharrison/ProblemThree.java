package nyc.c4q.ramonaharrison;

/**
 * Created by Ramona Harrison
 * on 8/28/16
 *
 * Check to see if a string has the same count of 'x's and 'o's. The method must
 * return a boolean and be case insensitive. The string may contain any Unicode
 * character -- not just 'x's and 'o's -- and may be of any length.
 *
 * XO("ooxx")    // returns true
 XO("xooxx")   // returns false
 XO("ooxXm")   // returns true
 XO("zpzpzpp") // returns true because zero 'x's and 'o's are present
 XO("zzoo")    // returns false
 */

public class ProblemThree {

    public static void main(String[] args) {
        System.out.println(sameXo("ooxx"));
    }

    public static boolean sameXo(String xo) {
        int totalX = 0;
        int totalO = 0;

        for (int i = 0; i < xo.length(); i++) {

            if (Character.toLowerCase(xo.charAt(i)) == 'x') {
                totalX++;
            }

            if (Character.toLowerCase(xo.charAt(i)) == 'o') {
                totalO++;
            }
        }

        return totalX == totalO;

    }
}
