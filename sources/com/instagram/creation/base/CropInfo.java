package com.instagram.creation.base;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

public final class CropInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C376419Hx(80);
    public final int A00;
    public final int A01;
    public final Rect A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r3.height() != r5) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CropInfo(android.graphics.Rect r3, int r4, int r5) {
        /*
            r2 = this;
            r0 = 3
            X.0qQ.A0B(r3, r0)
            r2.<init>()
            r2.A01 = r4
            r2.A00 = r5
            r2.A02 = r3
            int r0 = r3.width()
            if (r0 != r4) goto L_0x001a
            int r1 = r3.height()
            r0 = 0
            if (r1 == r5) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            r2.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.CropInfo.<init>(android.graphics.Rect, int, int):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CropInfo: Original dims: ");
        sb.append(this.A01);
        sb.append(" x ");
        sb.append(this.A00);
        sb.append(" cropRect: ");
        sb.append(this.A02);
        return sb.toString();
    }
}
