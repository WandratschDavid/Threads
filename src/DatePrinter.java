import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter implements Runnable
{
    private Date date;
    private int limit;

    DatePrinter(int limit)
    {
        this.limit = limit;
    }

    @Override
    public void run()
    {
        for (int i = 1; i < limit; i++)
        {
            SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-YY 'at' HH:MM:SS");
            this.date = new Date(System.currentTimeMillis());
            System.out.println(formatter.format(date));
        }
    }
}