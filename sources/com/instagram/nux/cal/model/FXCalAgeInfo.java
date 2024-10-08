package com.instagram.nux.cal.model;

import X.LVO;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

public final class FXCalAgeInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(63);
    public int A00;
    public Boolean A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r0.booleanValue() == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            java.lang.Boolean r0 = r3.A01
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != 0) goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            java.lang.String r0 = r3.A06
            r4.writeString(r0)
            java.lang.String r0 = r3.A02
            r4.writeString(r0)
            java.lang.String r0 = r3.A04
            r4.writeString(r0)
            java.lang.String r0 = r3.A03
            r4.writeString(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0034
            r4.writeBoolean(r2)
        L_0x0029:
            java.lang.String r0 = r3.A05
            r4.writeString(r0)
            int r0 = r3.A00
            r4.writeInt(r0)
            return
        L_0x0034:
            r4.writeInt(r2)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.cal.model.FXCalAgeInfo.writeToParcel(android.os.Parcel, int):void");
    }

    public FXCalAgeInfo(Parcel parcel) {
        boolean z;
        this.A06 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        if (Build.VERSION.SDK_INT >= 29) {
            z = parcel.readBoolean();
        } else {
            z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
        }
        this.A01 = Boolean.valueOf(z);
        this.A05 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public FXCalAgeInfo() {
    }
}
