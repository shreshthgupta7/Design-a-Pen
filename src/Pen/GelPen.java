package Pen;

public class GelPen extends Pen{
    refil r;
    GelPen(refil r)
    {
        this.r=r;
    }
    public void write(){
    writebehaviour wb=writebehaviourfactory.style("addgel");
    wb.style();
    }
}
