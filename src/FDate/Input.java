package FDate;

import java.util.Scanner;

public class Input
{
    Scanner scanner = new Scanner(System.in);

    private String Format;

    Acc acc = new Acc();

    public void In()
    {
        System.out.print("Type a format of date: ");

        Format = scanner.nextLine();

        acc.IsAcceptable(Format);
    }
}
