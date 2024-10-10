import java.lang.reflect.Array;
import java.util.ArrayList;

public class Aktivitet {

    private static ArrayList<Aktivitet> tabel = new ArrayList<>();

    public static void setTabel(ArrayList<Aktivitet> table) {
        tabel = table;
    }

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


   private void swab (ArrayList<Aktivitet> tabel, int x, int y)
    {
        Aktivitet a = new Aktivitet();
        a = tabel.get(x);
        tabel.set(x, tabel.get(y));
        tabel.set(y, a);
    }

    public void sorterEvent(ArrayList<Aktivitet> tabel)
    {
        for(int i = 0; i < antalAktivitet; i++)
            for(int j = 0; j < antalAktivitet - 1; j++)
            {
                if(tabel.get(j).getEvent() > tabel.get(j + 1).getEvent() )
                {
                    swab(j, j + 1);
                }
            }
    }

}
