package com.instagram.discovery.related.model;

import X.002;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class RelatedItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(38);
    public int A00;
    public ImageUrl A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A00() {
        /*
            r2 = this;
            java.lang.Integer r0 = r2.A02
            if (r0 != 0) goto L_0x0011
            java.lang.String r1 = r2.A04
            int r0 = r1.hashCode()
            switch(r0) {
                case 3599307: goto L_0x0012;
                case 697547724: goto L_0x001d;
                case 1901043637: goto L_0x0028;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x000f:
            r2.A02 = r0
        L_0x0011:
            return r0
        L_0x0012:
            java.lang.String r0 = "user"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x000f
        L_0x001d:
            java.lang.String r0 = "hashtag"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x000f
        L_0x0028:
            java.lang.String r0 = "location"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.related.model.RelatedItem.A00():java.lang.Integer");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }

    public final String A01() {
        if (A00().intValue() != 0) {
            return this.A05;
        }
        return 002.A0R("#", this.A05);
    }
}
