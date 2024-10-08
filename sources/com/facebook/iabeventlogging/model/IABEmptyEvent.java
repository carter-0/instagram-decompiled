package com.facebook.iabeventlogging.model;

import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;

public class IABEmptyEvent extends IABEvent {
    public IABEmptyEvent() {
        super(C8945RGn.EMPTY, "", -1, -1);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABEmptyEvent{");
        Pxh.A1C(this, "type=", A16);
        Pxf.A12(this.A01, A16);
        return Pxg.A0y(A16, this.A00);
    }
}
