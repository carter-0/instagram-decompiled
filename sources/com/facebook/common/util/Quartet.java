package com.facebook.common.util;

import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public class Quartet extends Triplet implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(76);
    public final Object A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Quartet(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.Class<X.RV3> r0 = X.RV3.class
            java.lang.Object r3 = X.Pxi.A0U(r5, r0)
            java.lang.Object r2 = X.Pxi.A0U(r5, r0)
            java.lang.Object r1 = X.Pxi.A0U(r5, r0)
            java.lang.Object r0 = X.Pxi.A0U(r5, r0)
            r4.<init>(r3, r2, r1)
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.util.Quartet.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(this.A00);
    }
}
