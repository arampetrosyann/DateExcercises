package com.company;

import java.time.LocalDate;

public class BirthDate
{
    LocalDate date = LocalDate.now();

    int year = date.getYear();

    int birth;

    public void Date (int Age)
    {
        System.out.print("The year of birth - ");

        birth = year - Age;

        System.out.println(birth);

    }
}
