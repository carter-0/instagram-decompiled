package com.instagram.model.shopping;

import X.AnonymousClass7TF;
import X.C16659Uyv;
import X.C71269Ogb;
import X.JTR;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductSource implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(87);
    public C16659Uyv A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public ProductSource(C16659Uyv uyv, String str) {
        this.A01 = str;
        this.A00 = uyv;
        this.A04 = null;
        this.A03 = null;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r0) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0056
            r2 = 0
            if (r5 == 0) goto L_0x001e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x001e
            com.instagram.model.shopping.ProductSource r5 = (com.instagram.model.shopping.ProductSource) r5
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == 0) goto L_0x001f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
        L_0x001e:
            return r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            return r2
        L_0x0022:
            X.Uyv r1 = r4.A00
            X.Uyv r0 = r5.A00
            if (r1 != r0) goto L_0x001e
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r5.A04
            if (r1 == 0) goto L_0x0035
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0038
            return r2
        L_0x0035:
            if (r0 == 0) goto L_0x0038
            return r2
        L_0x0038:
            java.lang.String r1 = r4.A03
            java.lang.String r0 = r5.A03
            if (r1 == 0) goto L_0x0045
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0048
            return r2
        L_0x0045:
            if (r0 == 0) goto L_0x0048
            return r2
        L_0x0048:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 == 0) goto L_0x0053
            boolean r3 = r1.equals(r0)
            return r3
        L_0x0053:
            if (r0 == 0) goto L_0x0056
            r3 = 0
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.shopping.ProductSource.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        int A07 = (((AnonymousClass7TF.A07(this.A00, JTR.A0G(this.A01) * 31) + JTR.A0G(this.A04)) * 31) + JTR.A0G(this.A03)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A07 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00.toString());
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public ProductSource() {
    }
}
