package WriteBehaviourStrategy.WriteBehaviourStrategyGelPen;

import Pen_Types.Gel_Pen_Types.addgel;
import WriteBehaviourStrategy.writebehaviour;

public class writebehaviourfactoryforGelPen {
public static writebehaviour style(String s) {
    if (s == "AddGel") {
        addgel ad=new addgel();
        ad.write();
    }
    return null;
    }
}
