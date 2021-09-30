public class CountPrinter implements Runnable
{
    private int limit;

    CountPrinter(int limit)
    {
        this.limit = limit;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < limit; i++)
        {
            System.out.println(i);
        }
    }
}