package com.facebook.videolite.transcoder.base;

import X.002;
import X.AnonymousClass7TF;
import X.C266784aL;
import X.Pxf;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class SphericalMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(72);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r5 = (com.facebook.videolite.transcoder.base.SphericalMetadata) r5;
        r1 = r4.A00;
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r1 = r4.A01;
        r0 = r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0026
            boolean r0 = r5 instanceof com.facebook.videolite.transcoder.base.SphericalMetadata
            r2 = 0
            if (r0 == 0) goto L_0x0027
            com.facebook.videolite.transcoder.base.SphericalMetadata r5 = (com.facebook.videolite.transcoder.base.SphericalMetadata) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 == r0) goto L_0x0018
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0018:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == r0) goto L_0x0026
            if (r1 == 0) goto L_0x0027
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            return r3
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.videolite.transcoder.base.SphericalMetadata.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Pxf.A0A(this.A00, this.A01);
    }

    public final String toString() {
        return 002.A11("SphericalMetadata{projectionType=", this.A00, ", stereoMode=", this.A01, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public SphericalMetadata(String str, String str2) {
        boolean z = true;
        C266784aL.A06(AnonymousClass7TF.A1V(str), "projectionType is null");
        this.A00 = str;
        C266784aL.A06(str2 == null ? false : z, "stereoMode is null");
        this.A01 = str2;
    }

    public SphericalMetadata(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
