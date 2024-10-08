package com.facebook.video.heroplayer.ipc;

import X.002;
import X.2Z0;
import X.2Z1;
import X.C257183wz;
import X.C273654mx;
import X.Pxi;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class FirstDataSegmentCacheCheckEndEvent extends 2Z0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(66);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final C257183wz A05;
    public final String A06;

    public final int describeContents() {
        return 0;
    }

    public FirstDataSegmentCacheCheckEndEvent(Parcel parcel) {
        super(2Z1.A0C);
        String readString = parcel.readString();
        this.A06 = readString == null ? "" : readString;
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
        C257183wz r0 = (C257183wz) Pxi.A0U(parcel, C257183wz.class);
        this.A05 = r0 == null ? C257183wz.NOT_APPLY : r0;
        this.A04 = parcel.readLong();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeValue(this.A05);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
    }

    public final String toString() {
        return 002.A15(002.A0R("videoId=", this.A06), 002.A0Q(C273654mx.A00(200), this.A01), 002.A0O(C273654mx.A00(202), this.A00), 002.A0R(C273654mx.A00(439), this.A05.A01), 002.A0Q(", startPos=", this.A04), 002.A0Q(", requestLength=", this.A03), 002.A0Q(", readByteLength=", this.A02));
    }

    public FirstDataSegmentCacheCheckEndEvent(C257183wz r2, String str, int i, long j, long j2, long j3, long j4) {
        super(2Z1.A0C);
        this.A06 = str;
        this.A01 = j;
        this.A00 = i;
        this.A05 = r2;
        this.A04 = j2;
        this.A03 = j3;
        this.A02 = j4;
    }
}
