/*
--> Es fällt auf das es die parallele Ausführung nur bei einer vermehrten Ausführung besser ist!
    => bei wenig Ausführungen wird es nacheinander ausgeführt (ist nicht parallel)!
 */

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("*** Welcome ***");

        int limit = 200000;

        DatePrinter dp = new DatePrinter(limit);
        Thread th1 = new Thread(dp);

        CountPrinter cp = new CountPrinter(limit);
        Thread th2 = new Thread(cp);

        th1.start();
        th2.start();
    }
}