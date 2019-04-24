package Friday;

import java.time.LocalDate;

import java.time.DayOfWeek;

import java.time.format.DateTimeFormatter;

public class Day
{
    LocalDate a = LocalDate.now();

    LocalDate b = LocalDate.now();

    DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd/MM/YY");

    DayOfWeek fixFriday = DayOfWeek.FRIDAY;

    DayOfWeek dayOfWeek = a.getDayOfWeek();

    public void Check()
    {
        System.out.print("Today is - ");

        System.out.println(dayOfWeek);

        for (int i = 0; i < 8; i++)
        {
            dayOfWeek = a.getDayOfWeek();

            if (dayOfWeek == fixFriday)
            {
                System.out.print("The dates of previous Friday is ");

                System.out.println(Formatter.format(a));

                break;
            }

            a = a.minusDays(1);
        }

        for (int i = 0; i < 8; i++)
        {
            dayOfWeek = b.getDayOfWeek();

            if (dayOfWeek == fixFriday)
            {
                System.out.print("The dates of next Friday is ");

                System.out.print(Formatter.format(b));

                break;
            }

            b = b.plusDays(1);
        }
    }
}
