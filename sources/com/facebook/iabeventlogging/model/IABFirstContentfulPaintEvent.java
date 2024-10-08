package com.facebook.iabeventlogging.model;

import X.0qQ;
import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;

public final class IABFirstContentfulPaintEvent extends IABEvent {
    public final long A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IABFirstContentfulPaintEvent(String str, long j, long j2) {
        super(C8945RGn.IAB_FIRST_CONTENTFUL_PAINT, str, j, j2);
        0qQ.A0B(str, 1);
        this.A00 = j2;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABFirstContentfulPaintEvent{");
        A16.append(", iabSessionId='");
        Pxf.A1P(A16, this.A03);
        A16.append(", eventTs=");
        Pxf.A12(this.A01, A16);
        String A0y = Pxg.A0y(A16, this.A00);
        0qQ.A07(A0y);
        return A0y;
    }
}
