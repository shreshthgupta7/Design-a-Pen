package Pen;

import Pen_Types.Gel_Pen_Types.GelPen;
import Pen_Types.Pen;

public class penfactory {
    public static Pen getpen(String k)
    {
        if(k=="GelPen")
            return new GelPen();
        return null;
    }
}
