import java.text.SimpleDateFormat;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.time.*;
import java.util.concurrent.TimeUnit;


class SolarDaysCalculator
{

    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Hello!\n" + "My name is SolarDaysCalculator 2021.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("And what is your name?");
        System.out.println();
        String userName = scanner.nextLine();
        System.out.println();
        System.out.println(userName + ", do You want to know how many days are You live on the Earth?!");
        System.out.println("If your answer 'yes' - then type your birth year, like YYYY, and press ENTER, please.");
        int userYear = scanner.nextInt();
        System.out.println("Good. Now, please type your birth month, like MM, and press ENTER.");
        int userMonth = scanner.nextInt();
        System.out.println("Ok. The last You need to type is your birth date . So, please do it, like DD, and press ENTER.");
        int userDay = scanner.nextInt();

        Clock sysClock = Clock.systemUTC();

        LocalDate nowLocalDate = LocalDate.now(sysClock);

        /*
        SimpleDateFormat timeFolowing = new SimpleDateFormat("yyyy,MM,dd");
        System.out.println(timeFolowing.format(nowLocalDate));
        */

        int nowYear = nowLocalDate.getYear();
        int nowMonth = nowLocalDate.getMonthValue();
        int nowDate = nowLocalDate.getDayOfMonth();
        int nowDayOfYear = nowLocalDate.getDayOfYear();
        int deltaYear;
        int deltaMonth;
        int deltaDate;

        LocalDate userDate = LocalDate.of(userYear, userMonth, userDay);
        int userDayOfYear = userDate.getDayOfYear();
/*
        System.out.println("Твой день рождения, " + userName + " " + userDate + " -> " + userDayOfYear);
        System.out.println();
        System.out.println("А сегодня " + nowLocalDate + " -> " + nowDayOfYear);
*/
        long dayAll = ChronoUnit.DAYS.between(userDate, nowLocalDate);

        try
        {
            System.out.println();
            System.out.println("Congratulations, " + userName + ", today is your " + (dayAll+1) + "-th sunny day !!!");
            System.out.println();
            System.out.println();
            System.out.println("2021 Alex Briz (c) SolarDaysCalculator");
            System.out.println();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
