package Pen;

import Pen_Types.Pen;

public class client {
    public static void main(String[] args) {
        //Pen p= new GelPen(new refil(new ink("blue"),new nib(5)));
        Pen p=penfactory.getpen("GelPen");
        p.write("AddGel");
    }
}
