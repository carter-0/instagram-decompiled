package com.google.android.gms.common;

import X.C301145yd;
import X.Pxf;
import X.Pxi;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(52);
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzq(int r6, int r7, java.lang.String r8, boolean r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.A03 = r9
            r5.A02 = r8
            r4 = 6
            int[] r3 = new int[r4]
            r3 = {1, 2, 3, 4, 5, 6} // fill-array
            r2 = 0
        L_0x000e:
            r1 = r3[r2]
            int r0 = r1 + -1
            if (r1 == 0) goto L_0x0038
            if (r0 == r6) goto L_0x001b
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x000e
            r1 = 1
        L_0x001b:
            int r0 = r1 + -1
            r5.A00 = r0
            r4 = 3
            int[] r3 = new int[r4]
            r3 = {1, 2, 3} // fill-array
            r2 = 0
        L_0x0026:
            r1 = r3[r2]
            int r0 = r1 + -1
            if (r1 == 0) goto L_0x0038
            if (r0 == r7) goto L_0x0033
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x0026
            r1 = 1
        L_0x0033:
            int r0 = r1 + -1
            r5.A01 = r0
            return
        L_0x0038:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzq.<init>(int, int, java.lang.String, boolean):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A09(parcel, 1, this.A03);
        C301145yd.A0B(parcel, this.A02);
        C301145yd.A07(parcel, 3, this.A00);
        Pxi.A12(parcel, this.A01, A032);
    }
}
