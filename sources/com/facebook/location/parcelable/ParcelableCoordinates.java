package com.facebook.location.parcelable;

import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableCoordinates implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(17);
    public final double A00;
    public final double A01;
    public final Float A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeValue(this.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r6 == null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ParcelableCoordinates(android.os.Parcel r9) {
        /*
            r8 = this;
            double r4 = r9.readDouble()
            java.lang.Double r7 = java.lang.Double.valueOf(r4)
            double r2 = r9.readDouble()
            java.lang.Double r6 = java.lang.Double.valueOf(r2)
            r0 = 0
            java.lang.Object r1 = r9.readValue(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            r8.<init>()
            if (r7 == 0) goto L_0x001f
            r0 = 1
            if (r6 != 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            X.17k.A0E(r0)
            r8.A00 = r4
            r8.A01 = r2
            r8.A02 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.location.parcelable.ParcelableCoordinates.<init>(android.os.Parcel):void");
    }
}
