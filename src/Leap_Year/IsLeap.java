package Leap_Year;

public class IsLeap
{

    public void Leap_Chechking(int year)
    {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        {
            System.out.print(year + " is a leap year");
        }

        else {
            System.out.print(year + " is not a leap year");
        }
    }
}
