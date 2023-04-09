package Pen;

public class GelPen extends Pen{
    refil r;

    writebehaviour wb;
    public void write(String k) {
        wb = writebehaviourfactoryforGelPen.style(k);
    }
}
