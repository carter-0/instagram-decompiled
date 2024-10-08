package com.google.android.exoplayer2.offline;

import X.AnonymousClass7TE;
import X.Pxe;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public final class StreamKey implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(75);
    public final int A00;
    public final int A01;
    public final int A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            StreamKey streamKey = (StreamKey) obj;
            if (!(this.A01 == streamKey.A01 && this.A00 == streamKey.A00 && this.A02 == streamKey.A02)) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        StreamKey streamKey = (StreamKey) obj;
        int i = this.A01 - streamKey.A01;
        if (i != 0) {
            return i;
        }
        int i2 = this.A00 - streamKey.A00;
        if (i2 == 0) {
            return this.A02 - streamKey.A02;
        }
        return i2;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
    }

    public StreamKey(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A01);
        A1A.append(".");
        A1A.append(this.A00);
        A1A.append(".");
        return Pxe.A0z(A1A, this.A02);
    }
}
