package com.facebook.iabeventlogging.model;

import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;

public class IABOpenMenuEvent extends IABEvent {
    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABOpenMenuEvent{");
        Pxh.A1C(this, "type=", A16);
        Pxf.A12(this.A01, A16);
        return Pxg.A0y(A16, this.A00);
    }
}
