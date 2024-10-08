package com.facebook.blescan.parcelable;

import X.AnonymousClass7TF;
import X.C10726Rx4;
import X.JTR;
import X.Pxh;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableBleScanResult extends C10726Rx4 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(13);

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r1.equals(r0) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L_0x0040
            r5 = 0
            if (r8 == 0) goto L_0x002e
            boolean r0 = r8 instanceof X.C10726Rx4
            if (r0 == 0) goto L_0x002e
            X.Rx4 r8 = (X.C10726Rx4) r8
            long r3 = r7.A01
            long r1 = r8.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            long r3 = r7.A02
            long r1 = r8.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 != r0) goto L_0x002e
            java.lang.String r1 = r7.A03
            java.lang.String r0 = r8.A03
            if (r1 == 0) goto L_0x002f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0032
        L_0x002e:
            return r5
        L_0x002f:
            if (r0 == 0) goto L_0x0032
            return r5
        L_0x0032:
            java.lang.String r1 = r7.A04
            java.lang.String r0 = r8.A04
            if (r1 == 0) goto L_0x003d
            boolean r6 = r1.equals(r0)
            return r6
        L_0x003d:
            if (r0 == 0) goto L_0x0040
            r6 = 0
        L_0x0040:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.blescan.parcelable.ParcelableBleScanResult.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j = this.A01;
        return ((((AnonymousClass7TF.A01(this.A02, ((int) (j ^ (j >>> 32))) * 31) + JTR.A0G(this.A03)) * 31) + this.A00) * 31) + Pxh.A0B(this.A04);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
    }
}
