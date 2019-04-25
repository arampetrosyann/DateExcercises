package com.company;

import java.util.Scanner;

public class Input
{
    Scanner scanner = new Scanner(System.in);

    int age;

    BirthDate birthDate = new BirthDate();

    public void Age()
    {
        System.out.print("Enter your age: ");

        age = scanner.nextInt();

        birthDate.Date(age);
    }
}
