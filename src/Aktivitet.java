import java.util.ArrayList;

public class Aktivitet {

    public Aktivitet()
    { }

    private int     event;
    private String  task;
    private int     duration;

    private int antalAktivitet = 0;


    public Aktivitet(int e, String t, int d)
    {
        event = e;
        task = t;
        duration = d;
    }

    public int getEvent()
    {
        return event;
    }

    public String getTask()
    {
        return task;
    }

    public int getDuration()
    {
        return duration;
    }

    public String toString()
    {
        return "event; " + event + " task; " + task + " duration; " + duration;
    }
}
