package Pen_Types.Gel_Pen_Types;

import Pen_Types.Pen;
import Pen_Types.Pen_Attributes.refil;
import WriteBehaviourStrategy.WriteBehaviourStrategyGelPen.writebehaviourfactoryforGelPen;
import WriteBehaviourStrategy.writebehaviour;

public class GelPen extends Pen {
    refil r;

    writebehaviour wb;
    public void write(String k) {
        wb = writebehaviourfactoryforGelPen.style(k);
    }
}
