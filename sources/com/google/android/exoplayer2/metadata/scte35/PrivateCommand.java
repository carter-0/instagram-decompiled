package com.google.android.exoplayer2.metadata.scte35;

import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = SWW.A00(67);
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeByteArray(this.A02);
    }

    public PrivateCommand(long j, long j2, byte[] bArr) {
        this.A01 = j2;
        this.A00 = j;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A02 = parcel.createByteArray();
    }
}
