package androidx.media3.container;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66583MXo;
import X.C7216Pzk;
import X.Pxe;
import X.Pxh;
import X.Xo1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

public final class Mp4TimestampData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(23);
    public final long A00;
    public final long A01;
    public final long A02;

    public final /* synthetic */ void E36(Xo1 xo1) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mp4TimestampData)) {
            return false;
        }
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj;
        return this.A00 == mp4TimestampData.A00 && this.A01 == mp4TimestampData.A01 && this.A02 == mp4TimestampData.A02;
    }

    public final int hashCode() {
        long j = this.A00;
        return Pxh.A06(this.A02, AnonymousClass7TF.A01(this.A01, C66583MXo.A01((int) (j ^ (j >>> 32)))));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
    }

    public Mp4TimestampData(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Mp4Timestamp: creation time=");
        A1A.append(this.A00);
        A1A.append(", modification time=");
        A1A.append(this.A01);
        A1A.append(", timescale=");
        return Pxe.A10(A1A, this.A02);
    }

    public Mp4TimestampData(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = -1;
    }

    public Mp4TimestampData(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
    }
}
