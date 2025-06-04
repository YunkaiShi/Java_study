import java.time.*;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class CompareDate {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入开始的年,月,日");
        System.out.println("年月日之间用-,/或.分隔\n例如:2018-2-12");

        String regex = "[-./]";
        String[] input = scanner.nextLine().split(regex);
        int year = Integer.parseInt(input[0]);
        int month = Integer.parseInt(input[1]);
        int day = Integer.parseInt(input[2]);

        LocalDate dateStart = LocalDate.of(year, month, day);

        System.out.print("输入结束的年,月,日:");
        input = scanner.nextLine().split(regex);
        year = Integer.parseInt(input[0]);
        month = Integer.parseInt(input[1]);
        day = Integer.parseInt(input[2]);

        LocalDate dateEnd = LocalDate.of(year, month, day);
        long days = dateStart.until(dateEnd, ChronoUnit.DAYS);
        boolean boo = dateEnd.isAfter(dateStart);

        if(boo) {
            System.out.println(dateEnd + "在" + dateStart + "之后");
        }
        System.out.println(dateStart + "和" + dateEnd + "相隔:");
        System.out.println(Math.abs(days) + "天(不足一天的零头按0计算)");
    }
}