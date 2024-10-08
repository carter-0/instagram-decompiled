package com.instagram.model.direct;

import X.C376399Hv;
import android.os.Parcelable;

public class DirectShareTargetLoggingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376399Hv(17);
    public Boolean A00;
    public Double A01;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r1 == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r3, int r4) {
        /*
            r2 = this;
            java.lang.Double r0 = r2.A01
            if (r0 == 0) goto L_0x001b
            double r0 = r0.doubleValue()
        L_0x0008:
            r3.writeDouble(r0)
            java.lang.Boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0016
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r3.writeByte(r0)
            return
        L_0x001b:
            r0 = 0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.direct.DirectShareTargetLoggingInfo.writeToParcel(android.os.Parcel, int):void");
    }
}
