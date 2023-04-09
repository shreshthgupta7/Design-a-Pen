package Pen;

public class writebehaviourfactoryforGelPen {
public static writebehaviour style(String s) {
    if (s == "addgel") {
        addgel ad=new addgel();
        ad.write();
    }
    return null;
    }
}
