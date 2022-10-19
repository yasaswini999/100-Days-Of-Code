//https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
import java.time.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
      return (LocalDate.of(year,month,day).getDayOfWeek().toString());
    }

}
