package FDate;

import java.time.format.DateTimeFormatter;

public class Acc
{
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("");

    public void IsAcceptable(String Format)
    {
        formatter = DateTimeFormatter.ofPattern(Format);
    }
}
