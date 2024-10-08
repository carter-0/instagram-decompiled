package com.google.android.exoplayer2.metadata.scte35;

import X.AnonymousClass4XV;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = SWW.A00(71);
    public final long A00;
    public final long A01;

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public static long A00(AnonymousClass4XV r8, long j) {
        long A02 = (long) r8.A02();
        if ((128 & A02) != 0) {
            return 8589934591L & ((((A02 & 1) << 32) | r8.A07()) + j);
        }
        return -9223372036854775807L;
    }
}
