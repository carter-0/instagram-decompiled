package com.facebook.auth.viewercontext;

import X.17k;
import X.AnonymousClass7TF;
import X.DbY;
import X.JTR;
import X.Pxg;
import X.Pxh;
import X.SWS;
import X.TRG;
import android.os.Parcel;
import android.os.Parcelable;

public class ViewerContext implements Parcelable {
    public static final ThreadLocal A0D = new TRG();
    public static final Parcelable.Creator CREATOR = SWS.A00(10);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r1.equals(r0) == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x00a4
            r2 = 0
            if (r5 == 0) goto L_0x0042
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0042
            com.facebook.auth.viewercontext.ViewerContext r5 = (com.facebook.auth.viewercontext.ViewerContext) r5
            boolean r1 = r4.A0A
            boolean r0 = r5.A0A
            if (r1 != r0) goto L_0x0042
            boolean r1 = r4.A0C
            boolean r0 = r5.A0C
            if (r1 != r0) goto L_0x0042
            boolean r1 = r4.A07
            boolean r0 = r5.A07
            if (r1 != r0) goto L_0x0042
            boolean r1 = r4.A09
            boolean r0 = r5.A09
            if (r1 != r0) goto L_0x0042
            boolean r1 = r4.A0B
            boolean r0 = r5.A0B
            if (r1 != r0) goto L_0x0042
            boolean r1 = r4.A08
            boolean r0 = r5.A08
            if (r1 != r0) goto L_0x0042
            java.lang.String r1 = r4.A05
            java.lang.String r0 = r5.A05
            if (r1 == 0) goto L_0x0043
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0046
        L_0x0042:
            return r2
        L_0x0043:
            if (r0 == 0) goto L_0x0046
            return r2
        L_0x0046:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == 0) goto L_0x0053
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0056
            return r2
        L_0x0053:
            if (r0 == 0) goto L_0x0056
            return r2
        L_0x0056:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 == 0) goto L_0x0063
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0066
            return r2
        L_0x0063:
            if (r0 == 0) goto L_0x0066
            return r2
        L_0x0066:
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r5.A04
            if (r1 == 0) goto L_0x0073
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0076
            return r2
        L_0x0073:
            if (r0 == 0) goto L_0x0076
            return r2
        L_0x0076:
            java.lang.String r1 = r4.A03
            java.lang.String r0 = r5.A03
            if (r1 == 0) goto L_0x0083
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0086
            return r2
        L_0x0083:
            if (r0 == 0) goto L_0x0086
            return r2
        L_0x0086:
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 == 0) goto L_0x0093
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0096
            return r2
        L_0x0093:
            if (r0 == 0) goto L_0x0096
            return r2
        L_0x0096:
            java.lang.String r1 = r4.A06
            java.lang.String r0 = r5.A06
            if (r1 == 0) goto L_0x00a1
            boolean r3 = r1.equals(r0)
            return r3
        L_0x00a1:
            if (r0 == 0) goto L_0x00a4
            r3 = 0
        L_0x00a4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.auth.viewercontext.ViewerContext.equals(java.lang.Object):boolean");
    }

    static {
        if ("0".length() != 0) {
            new ViewerContext("", "0");
        }
    }

    public ViewerContext(String str, String str2) {
        17k.A0E(!AnonymousClass7TF.A1Q("0".length()));
        this.A05 = "0";
        this.A01 = "";
        this.A02 = null;
        this.A0A = false;
        this.A0C = false;
        this.A07 = false;
        this.A09 = false;
        this.A04 = null;
        this.A03 = null;
        this.A06 = null;
        this.A00 = null;
        this.A0B = false;
        this.A08 = false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((JTR.A0G(this.A05) * 31) + JTR.A0G(this.A01)) * 31) + JTR.A0G(this.A02)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + JTR.A0G(this.A04)) * 31) + JTR.A0G(this.A03)) * 31) + JTR.A0G(this.A06)) * 31) + Pxh.A0B(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
    }

    public ViewerContext(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A0A = AnonymousClass7TF.A1S(parcel.readInt(), 1);
        this.A0C = DbY.A1X(parcel);
        this.A07 = DbY.A1X(parcel);
        this.A09 = DbY.A1X(parcel);
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A06 = parcel.readString();
        this.A00 = parcel.readString();
        this.A0B = DbY.A1X(parcel);
        this.A08 = Pxg.A1V(parcel);
    }

    public ViewerContext() {
        this.A05 = null;
        this.A01 = null;
        this.A02 = null;
        this.A0A = false;
        this.A0C = false;
        this.A07 = false;
        this.A09 = false;
        this.A04 = null;
        this.A03 = null;
        this.A06 = null;
        this.A00 = null;
        this.A0B = false;
        this.A08 = false;
    }
}
