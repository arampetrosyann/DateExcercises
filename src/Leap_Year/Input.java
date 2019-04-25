package Leap_Year;

import java.util.Scanner;

public class Input
{
    Scanner scanner = new Scanner(System.in);

    private int year;

    IsLeap isLeap = new IsLeap();

    public void Initialization()
    {
        System.out.print("Enter the year: ");

        year = scanner.nextInt();

        isLeap.Leap_Chechking(year);
    }
}
