package com.facebook.video.heroplayer.ipc;

import X.002;
import X.2Z0;
import X.2Z1;
import X.C273654mx;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public class FirstDataSegmentCacheCheckStartEvent extends 2Z0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(67);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public FirstDataSegmentCacheCheckStartEvent(Parcel parcel) {
        super(2Z1.A0D);
        String readString = parcel.readString();
        this.A04 = readString == null ? "" : readString;
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
    }

    public final String toString() {
        return 002.A11(002.A0R("videoId=", this.A04), 002.A0Q(C273654mx.A00(200), this.A01), 002.A0O(C273654mx.A00(202), this.A00), 002.A0Q(", startPos=", this.A03), 002.A0Q(", requestLength=", this.A02));
    }

    public FirstDataSegmentCacheCheckStartEvent(String str, long j, long j2, long j3, int i) {
        super(2Z1.A0D);
        this.A04 = str;
        this.A01 = j;
        this.A00 = i;
        this.A03 = j2;
        this.A02 = j3;
    }
}
