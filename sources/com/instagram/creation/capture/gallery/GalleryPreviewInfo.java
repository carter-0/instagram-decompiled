package com.instagram.creation.capture.gallery;

import X.0qQ;
import X.C51971G9r;
import X.JTR;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.Arrays;

public final class GalleryPreviewInfo implements Parcelable {
    public static final LVP CREATOR = LVP.A00(12);
    public CropInfo A00 = null;
    public ExifImageData A01 = null;
    public String A02 = null;
    public float[] A03 = null;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x003f
            boolean r0 = r5 instanceof com.instagram.creation.capture.gallery.GalleryPreviewInfo
            if (r0 == 0) goto L_0x003d
            com.instagram.creation.capture.gallery.GalleryPreviewInfo r5 = (com.instagram.creation.capture.gallery.GalleryPreviewInfo) r5
        L_0x0009:
            r2 = 0
            if (r5 == 0) goto L_0x001a
            float[] r1 = r4.A03
            float[] r0 = r5.A03
            if (r1 == 0) goto L_0x001b
            if (r0 == 0) goto L_0x001a
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x001e
        L_0x001a:
            return r2
        L_0x001b:
            if (r0 == 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001a
            com.instagram.creation.base.CropInfo r1 = r4.A00
            com.instagram.creation.base.CropInfo r0 = r5.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001a
            com.instagram.creation.photo.util.ExifImageData r1 = r4.A01
            com.instagram.creation.photo.util.ExifImageData r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x003f
            return r2
        L_0x003d:
            r5 = 0
            goto L_0x0009
        L_0x003f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.gallery.GalleryPreviewInfo.equals(java.lang.Object):boolean");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloatArray(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        int i;
        float[] fArr = this.A03;
        int i2 = 0;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        } else {
            i = 0;
        }
        int A0G = ((((i * 31) + JTR.A0G(this.A02)) * 31) + C51971G9r.A0E(this.A00)) * 31;
        ExifImageData exifImageData = this.A01;
        if (exifImageData != null) {
            i2 = exifImageData.hashCode();
        }
        return A0G + i2;
    }
}
