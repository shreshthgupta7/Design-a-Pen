package Pen;

public class penfactory {
    public static Pen getpen(String k)
    {
        if(k=="GelPen")
            return new GelPen();
        return null;
    }
}
