package Pen;

public class writebehaviourfactory {
public static writebehaviour style(String s) {
    if (s == "addgel")
        return new addgel();
    return null;
    }
}
