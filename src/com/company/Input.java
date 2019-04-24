package com.company;

import java.util.Scanner;

public class Input
{
    Scanner scanner = new Scanner(System.in);

    int age;

    public void Age()
    {
        System.out.print("Enter your age - ");

        age = scanner.nextInt();

        BirthDate birthDate = new BirthDate();

        birthDate.Date(age);
    }






}
