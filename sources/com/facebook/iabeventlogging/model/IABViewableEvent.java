package com.facebook.iabeventlogging.model;

import X.0qQ;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.RIg;
import com.facebook.privacy.zone.api.ZonedValue;

public final class IABViewableEvent extends IABEvent {
    public final long A00;
    public final RIg A01;
    public final ZonedValue A02;
    public final long A03;
    public final long A04;
    public final String A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IABViewableEvent(X.RIg r10, com.facebook.privacy.zone.api.ZonedValue r11, java.lang.String r12, java.lang.String r13, long r14, long r16, long r18) {
        /*
            r9 = this;
            r0 = 1
            r4 = r12
            X.0qQ.A0B(r12, r0)
            X.RGn r3 = X.C8945RGn.IAB_VIEWABLE
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r4, r5, r7)
            r9.A04 = r14
            r9.A03 = r7
            r9.A02 = r11
            r0 = r18
            r9.A00 = r0
            r9.A05 = r13
            r9.A01 = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.iabeventlogging.model.IABViewableEvent.<init>(X.RIg, com.facebook.privacy.zone.api.ZonedValue, java.lang.String, java.lang.String, long, long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (java.lang.Long.valueOf(r1) != null) goto L_0x0022;
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
            java.lang.String r0 = r3.A05
            r4.writeString(r0)
            X.RIg r0 = r3.A01
            if (r0 == 0) goto L_0x0026
            long r1 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 == 0) goto L_0x0026
        L_0x0022:
            r4.writeLong(r1)
            return
        L_0x0026:
            r1 = -1
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.iabeventlogging.model.IABViewableEvent.writeToParcel(android.os.Parcel, int):void");
    }

    public final String toString() {
        Long l;
        StringBuilder A16 = Pxe.A16("IABViewableEvent{");
        A16.append("userClickTs=");
        A16.append(this.A00);
        Pxh.A1C(this, ", type=", A16);
        Pxf.A12(this.A04, A16);
        A16.append(this.A03);
        A16.append(", clickId=");
        A16.append(this.A05);
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
