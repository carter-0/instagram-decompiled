package com.facebook.wifiscan.parcelable;

import X.AnonymousClass7TE;
import X.C11379SQr;
import X.C51968G9o;
import X.C51971G9r;
import X.JTR;
import X.Pxf;
import X.Pxg;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableWifiScanResult extends C11379SQr implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(77);

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r1.equals(r0) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L_0x0088
            r5 = 0
            if (r8 == 0) goto L_0x0026
            boolean r0 = r8 instanceof X.C11379SQr
            if (r0 == 0) goto L_0x0026
            X.SQr r8 = (X.C11379SQr) r8
            long r3 = r7.A03
            long r1 = r8.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
            int r1 = r7.A02
            int r0 = r8.A02
            if (r1 != r0) goto L_0x0026
            java.lang.String r1 = r7.A07
            java.lang.String r0 = r8.A07
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002a
        L_0x0026:
            return r5
        L_0x0027:
            if (r0 == 0) goto L_0x002a
            return r5
        L_0x002a:
            java.lang.String r1 = r7.A08
            java.lang.String r0 = r8.A08
            if (r1 == 0) goto L_0x0037
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003a
            return r5
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            return r5
        L_0x003a:
            java.lang.Integer r1 = r7.A00
            java.lang.Integer r0 = r8.A00
            if (r1 == 0) goto L_0x0047
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004a
            return r5
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            return r5
        L_0x004a:
            java.lang.String r1 = r7.A09
            java.lang.String r0 = r8.A09
            if (r1 == 0) goto L_0x0057
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005a
            return r5
        L_0x0057:
            if (r0 == 0) goto L_0x005a
            return r5
        L_0x005a:
            java.lang.String r1 = r7.A0A
            java.lang.String r0 = r8.A0A
            if (r1 == 0) goto L_0x0067
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x006a
            return r5
        L_0x0067:
            if (r0 == 0) goto L_0x006a
            return r5
        L_0x006a:
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = r8.A0B
            if (r1 == 0) goto L_0x0077
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007a
            return r5
        L_0x0077:
            if (r0 == 0) goto L_0x007a
            return r5
        L_0x007a:
            java.lang.Boolean r1 = r7.A04
            java.lang.Boolean r0 = r8.A04
            if (r1 == 0) goto L_0x0085
            boolean r6 = r1.equals(r0)
            return r6
        L_0x0085:
            if (r0 == 0) goto L_0x0088
            r6 = 0
        L_0x0088:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wifiscan.parcelable.ParcelableWifiScanResult.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.SQr, com.facebook.wifiscan.parcelable.ParcelableWifiScanResult] */
    public static ParcelableWifiScanResult A00(C11379SQr sQr) {
        if (sQr == null) {
            return null;
        }
        long j = sQr.A03;
        String str = sQr.A07;
        int i = sQr.A02;
        String str2 = sQr.A08;
        return new C11379SQr(sQr.A04, sQr.A00, sQr.A05, sQr.A06, str, str2, sQr.A09, sQr.A0A, sQr.A0B, i, j);
    }

    public final int hashCode() {
        int i = 0;
        int A03 = ((((((((((((((((((C51968G9o.A03(this.A03) * 31) + JTR.A0G(this.A07)) * 31) + this.A02) * 31) + JTR.A0G(this.A08)) * 31) + C51971G9r.A0E(this.A00)) * 31) + JTR.A0G(this.A09)) * 31) + JTR.A0G(this.A0A)) * 31) + JTR.A0G(this.A0B)) * 31) + C51971G9r.A0E(this.A04)) * 31) + C51971G9r.A0E(this.A05)) * 31;
        Integer num = this.A06;
        if (num != null) {
            i = num.hashCode();
        }
        return A03 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A03);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A08);
        parcel.writeValue(this.A00);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeValue(this.A04);
        parcel.writeValue(this.A05);
        parcel.writeValue(this.A06);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ParcelableWifiScanResult{timestampMs=");
        A1A.append(this.A03);
        A1A.append(", BSSID='");
        char A00 = Pxf.A00(this.A07, A1A);
        A1A.append(", level=");
        A1A.append(this.A02);
        A1A.append(", SSID='");
        A1A.append(this.A08);
        A1A.append(A00);
        A1A.append(", frequency=");
        A1A.append(this.A00);
        A1A.append(", capabilities='");
        A1A.append(this.A09);
        A1A.append(A00);
        A1A.append(", operatorName='");
        A1A.append(this.A0A);
        A1A.append(A00);
        A1A.append(", venueName='");
        A1A.append(this.A0B);
        A1A.append(A00);
        A1A.append(", hasCaptivePortal=");
        A1A.append(this.A04);
        A1A.append(A00);
        A1A.append(", distanceMm=");
        A1A.append(this.A05);
        A1A.append(A00);
        A1A.append(", distanceStd=");
        return Pxg.A0p(this.A06, A1A);
    }
}
