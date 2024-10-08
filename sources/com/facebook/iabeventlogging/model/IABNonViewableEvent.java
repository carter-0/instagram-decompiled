package com.facebook.iabeventlogging.model;

import X.0qQ;
import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.RIg;
import com.facebook.privacy.zone.api.ZonedValue;

public final class IABNonViewableEvent extends IABEvent {
    public final long A00;
    public final RIg A01;
    public final ZonedValue A02;
    public final long A03;
    public final long A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IABNonViewableEvent(RIg rIg, ZonedValue zonedValue, String str, long j, long j2, long j3) {
        super(C8945RGn.IAB_NON_VIEWABLE, str, j, j2);
        0qQ.A0B(str, 1);
        this.A04 = j;
        this.A03 = j2;
        this.A02 = zonedValue;
        this.A00 = j3;
        this.A01 = rIg;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (java.lang.Long.valueOf(r1) != null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            super.writeToParcel(r4, r5)
            com.facebook.privacy.zone.api.ZonedValue r0 = r3.A02
            r4.writeParcelable(r0, r5)
            long r0 = r3.A00
            r4.writeLong(r0)
            X.RIg r0 = r3.A01
            if (r0 == 0) goto L_0x0021
            long r1 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 == 0) goto L_0x0021
        L_0x001d:
            r4.writeLong(r1)
            return
        L_0x0021:
            r1 = -1
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.iabeventlogging.model.IABNonViewableEvent.writeToParcel(android.os.Parcel, int):void");
    }

    public final String toString() {
        Long l;
        StringBuilder A16 = Pxe.A16("IABNonViewableEvent{");
        A16.append("userClickTs=");
        A16.append(this.A00);
        Pxh.A1C(this, ", type=", A16);
        Pxf.A12(this.A04, A16);
        A16.append(this.A03);
        A16.append(", nvSource=");
        RIg rIg = this.A01;
        if (rIg != null) {
            l = Long.valueOf(rIg.A00);
        } else {
            l = null;
        }
        String A0p = Pxg.A0p(l, A16);
        0qQ.A07(A0p);
        return A0p;
    }
}
